package tcp_server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.StringTokenizer;

import javax.swing.text.DefaultEditorKit.CopyAction;

public class ServerProcess extends Thread {
	Socket socket;
	DataInputStream input;
	DataOutputStream output;

	public ServerProcess(Socket socket) throws IOException {
		this.socket = socket;
		input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		output = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
		output.writeUTF("Wellcom to file manager");
		output.flush();
	}

	@Override
	public void run() {
		String line;
		StringTokenizer st;
		while (true) {
			try {
				line = input.readUTF();
				if ("QUIT".equalsIgnoreCase(line))
					break;
				processLine(line);
			} catch (IOException e) {
				// TODO: handle exception
			}
		}
	}

	private void processLine(String line) throws IOException {
		StringTokenizer st = new StringTokenizer(line);
		String command = st.nextToken();
		String sf, df;
		switch (command) {
		case "COPY":
			sf = st.nextToken();
			df = st.nextToken();
			if (copy(sf, df)) {
				output.writeUTF("copy success");
			} else {
				output.writeUTF("copy isn't success");
			}
			break;
		case "MOVE":
			sf = st.nextToken();
			df = st.nextToken();
			if (move(sf, df)) {
				output.writeUTF("move success");
			} else {
				output.writeUTF("move isn't success");
			}
			break;
		case "RENAME":
			sf = st.nextToken();
			df = st.nextToken();
			File sfs = new File(sf);
			File sfd = new File(df);
			if (sfs.renameTo(sfd))
				output.writeUTF("rename success");
			else
				output.writeUTF("rename false");
			break;
		default:
			break;
		}
	}

	private boolean copy(String sf, String df) {
		try {
			BufferedOutputStream bos = null;
			try {
				bos = new BufferedOutputStream(new FileOutputStream(df));
			} catch (FileNotFoundException e) {
				output.writeUTF("Server: can't create dest file");
				return false;
			}

			BufferedInputStream bis = null;
			try {
				bis = new BufferedInputStream(new FileInputStream(sf));
			} catch (FileNotFoundException e) {
				output.writeUTF("Server: can't open source file");
				return false;
			}

			byte[] data = new byte[1024 * 10];
			int i;
			while ((i = bis.read(data)) != -1) {
				bos.write(data, 0, i);
			}
			bos.flush();
			bos.close();
			bis.close();
			return true;
		} catch (NullPointerException e) {
			return false;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	private boolean move(String sf, String df) {
		try {
			File file = new File(sf);
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(df));

			byte[] data = new byte[1024 * 10];
			int i;
			while ((i = bis.read(data)) != -1) {
				bos.write(data, 0, i);
			}
			bos.close();
			bis.close();
			file.delete();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
}

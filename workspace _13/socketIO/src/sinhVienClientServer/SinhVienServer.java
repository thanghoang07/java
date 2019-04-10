package sinhVienClientServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SinhVienServer extends Thread {
	List<SinhVien> list = new ArrayList<SinhVien>();
	Socket sc;
	BufferedReader red;
	PrintWriter w;

	public SinhVienServer(Socket sc, BufferedReader br, PrintWriter pw) {
		super();
		this.sc = sc;
		this.red = br;
		this.w = pw;
	}

	//
	@Override
	public void run() {
		try {
			// get client
			red = new BufferedReader(new InputStreamReader(sc.getInputStream()));
			String readClient = red.readLine();
			System.out.println("line" + readClient);

			String result = readClient + "=";
			String[] anly = readClient.split(" ");
			String comm = anly[1];
			String start = anly[0];
			String end = anly[2];
			int a = 0;
			int b = 0;
			String total = null;
			w = new PrintWriter(new OutputStreamWriter(sc.getOutputStream()), true);
			// BufferedReader read = new BufferedReader(new InputStreamReader(in, cs));
			String line = "";
			if (readClient.equalsIgnoreCase("Exit")) {
				System.out.println("Goodbye!");
				w.println("Exit");
				sc.close();
				return;
			}
			// System.out.println(Arrays.toString(anly));
			// String st=
			while (anly != null) {
				System.out.println(line);
				try {
					a = Integer.parseInt(start);
					b = Integer.parseInt(end);
				} catch (NumberFormatException e) {
					System.out.println("No found Command");
					w.println("Again Input");
				}
				if (comm.equalsIgnoreCase("findByName")) {
					total = findByName(anly[1]);
				} else {
					w.println("No found Command");
				}
				result += total;
				System.out.println(result);
				w.println(result);
				break;
			}
		} catch (IOException e) {

		}
	}

	// create list sinhvien
	public void create() {
		list.add(new SinhVien("111", "A", 18, 4.9));
		list.add(new SinhVien("112", "S", 18, 3.9));
		list.add(new SinhVien("113", "G", 18, 5.9));
		list.add(new SinhVien("114", "F", 18, 2.9));
		list.add(new SinhVien("115", "D", 18, 1.9));
	}

	public String findByName(String name) {
		String result = "";
		for (SinhVien sv : list) {
			if (sv.getName().equalsIgnoreCase(name)) {
				result += sv.getId() + "\t" + sv.getName();
			}
		}
		return result;
	}

	public String findByUpperAge(int name) {
		String result = "";
		for (SinhVien sv : list) {
			if (sv.getAge() > name) {
				result += sv.getId() + "\t" + sv.getName();
			}
		}
		return result;
	}

	public String findByUnderAge(int name) {
		String result = "";
		for (SinhVien sv : list) {
			if (sv.getAge() <= name) {
				result += sv.getId() + "\t" + sv.getName();
			}
		}
		return result;
	}

	public String findByUpperGpa(double name) {
		String result = "";
		for (SinhVien sv : list) {
			if (sv.getGpa() <= name) {
				result += sv.getId() + "\t" + sv.getName();
			}
		}
		return result;
	}

	public String findByUnderGpa(double name) {
		String result = "";
		for (SinhVien sv : list) {
			if (sv.getGpa() > name) {
				result += sv.getId() + "\t" + sv.getName();
			}
		}
		return result;
	}
}

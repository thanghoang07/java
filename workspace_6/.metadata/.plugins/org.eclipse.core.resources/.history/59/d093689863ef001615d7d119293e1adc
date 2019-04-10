package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;

/**
 * All static methods required to save, load, and delete board state information.
 */
public class SaverLoader {
    private static final File file = new File(System.getProperty("user.home") + File.separator + "2048.sav");

    /**
     * Doesn't allow anyone outside of this class to instantiate Rules.
     */
    private SaverLoader() {}

    /**
     * Saves the given board to memory.
     * @param board The board to be saved.
     */
    public static void saveGame(Board board) {
	FileOutputStream fos;
	ObjectOutputStream oos;
	try {
	    fos = new FileOutputStream(file);
	    oos = new ObjectOutputStream(fos);
	    oos.writeObject(board);
	    oos.close();
	    fos.close();
	} catch (IOException e) {
	    // unable to save for some reason?
	}
    }

    /**
     * Loads a board from memory.
     * @return The board retrieved from memory, null if no valid board save was found.
     */
    public static Board loadGame() {
	FileInputStream fos;
	ObjectInputStream oos;
	Board board = null;
	Object obj;
	try {
	    fos = new FileInputStream(file);
	    oos = new ObjectInputStream(fos);
	    obj = oos.readObject();
	    if (obj instanceof Board) board = (Board) obj;
	    oos.close();
	    fos.close();
	} catch (IOException | ClassNotFoundException e) {
	    // file not found, or some other error... thus no game save available or broken so return null
	}
	return board;
    }

    /**
     * Removes any board saves from memory.
     */
    public static void removeSave() {
	try {
	    Files.deleteIfExists(file.toPath());
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

}
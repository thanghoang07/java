package fileClass;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IFileClass {
	public boolean deleteFile(String path) throws IOException, FileNotFoundException;

	public boolean delete(String path) throws IOException, FileNotFoundException;
}

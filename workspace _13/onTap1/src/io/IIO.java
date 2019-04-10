package io;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IIO {
	public boolean fileCopy(String sourceFile, String destFile, boolean moved)
			throws IOException, FileNotFoundException;

	public boolean folderCopy(String sourceFolder, String destFolder, boolean moved)
			throws IOException, FileNotFoundException;
}

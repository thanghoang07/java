/*
    Vladimir Jimenez
    License: MIT
 */

package tuan8_1_stack;

import java.io.*;
import java.util.Scanner;

public class FileEditor
{
    private File   file;
    private String filePath;
    private int    lineCount;

    /**
     * Creates an object that will handle all the text file manipulation
     *
     * @param pathToFile The path to the file we will be manipulating
     *
     * @throws IOException
     */
    public FileEditor (String pathToFile) throws IOException
    {
        this(new File(pathToFile));
    }

    /**
     * Creates an object that will handle all the text file manipulation
     *
     * @param _file The file we will be modifying
     */
    public FileEditor (File _file) throws IOException
    {
        if (!_file.exists())
        {
            throw new FileNotFoundException();
        }

        file       = _file;
        filePath   = _file.getCanonicalPath();
        lineCount  = countLines();
    }

    /**
     * Counts the total number of lines that the specified file contains
     *
     * @return The total number of lines
     */
    private int countLines ()
    {
        LineNumberReader lnr = null;

        try
        {
            lnr = new LineNumberReader(new FileReader(new File(filePath)));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File '" + filePath + "' not found.");
        }

        if (lnr != null)
        {
            try
            {
                lnr.skip(Long.MAX_VALUE);
            }
            catch (IOException e)
            {
                System.out.println("An IOException has occurred while getting the total line count.");
            }
        }

        return lnr.getLineNumber();
    }

    /**
     * Creates a new file if the file does not exist and returns the main.FileEditor object of it
     *
     * @param filePath The location of where the file is to be created
     *
     * @return A FileEditor object
     *
     * @throws IOException
     */
    public static FileEditor createFile (String filePath) throws IOException
    {
        File _myFile = new File(filePath);
        _myFile.createNewFile();

        return new FileEditor(_myFile.getCanonicalPath());
    }

    /**
     * Returns the total number of lines a file has
     *
     * @return The total amount of lines
     */
    public int get_line_count ()
    {
        return this.lineCount;
    }

    /**
     * Get the content found on line X of the file
     *
     * @param lineNumber The line number we will return
     *
     * @return The contents of the line specified
     */
    public String returnLine (int lineNumber) throws FileNotFoundException
    {
        int _lineCount = 0; //Keep track of the line number
        String line; //A place to store the current line being read

        Scanner myFile = new Scanner(new File(filePath)); //Open the file

        while (myFile.hasNext()) //Read each line of the text file
        {
            line = myFile.nextLine(); //Store the current line for easy access
            _lineCount++; //Increase the line count

            if (lineNumber == _lineCount) //If the line equals the parameter, return the line number
            {
                return line;
            }
        }

        myFile.close(); //Close the file
        return ""; //Line not found
    }

    /**
     * Write the specified text to the end of the file (adds a new line after the text is written)
     *
     * @param textLine The line of text to be written
     *
     * @throws IOException
     */
    public void writeToFile (String textLine) throws IOException
    {
        FileWriter write = new FileWriter(file, true);
        PrintWriter print_line = new PrintWriter(write);

        print_line.printf("%s" + "\n", textLine); //Write the text to the file with a new line at the end
        print_line.close(); //Close the file
        write.close();
    }
}
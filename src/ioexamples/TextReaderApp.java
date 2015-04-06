package ioexamples;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * TextReaderApp.java	1.00 Nov 25, 2003
 *
 * A class that reads file from a text file, with buffering. Uses the file
 * "test.txt" which is in this project. Try reading your own text file stored in
 * a different directory.
 */
public class TextReaderApp {

    public static void main(String[] args) throws Exception// - need this if you don't have a try-catch-finally
    {
        /* This uses System properties to extract the correct
         * file path separator character.
         * 
         * Examples:
         *    On Windows:  (absolute paths)
         *                 C:\\temp\\FileName.txt ( \ = escape char in Java!)
         *                 c:/temp/FileName.txt  (alternate)
         * 
         * 				   (relative path)
         *                 resources/FileName.txt (path relative to class location)
         * 
         *    On Unix:     /usr/temp/filename.txt (always relative)
         */

        /* 
         * Preferred way to reference a file path ... platform neutral. Line 30
         * shows how to use a system dependent separator char in a portable way.
         * Line 32 shows how to reference a file in the current classpath.
         */
	File file = new File("src" + File.separatorChar + "test.txt");
//        File file = new File(File.separatorChar + "temp" + File.separatorChar + "test.txt");
//                + "test.txt");

        /* Here are Windows/Unix examples that tries to read a file
         * in the temp directory. Notice that the path begins with a forward
         * slash. This is an example of relative path syntax. In this case,
         * the path begins with a slash, which means it is relative to 
         * the root of the startup drive.
         */
//	File file = new File("/temp/example.txt");  // Windows or Unix/Linux
//	File file = new File("C:\\temp\\example.txt");  // Windows only
//	System.out.println("Absolute Path: " + file.getAbsolutePath());
//	System.out.println("Canonical Path: " + file.getCanonicalPath()); // what's the difference?
////	
////	// This references the working directory
//	System.out.println("Working directory is: " + System.getProperty("user.home")); // set/get working directory
        // check if file exists, and if so, loop through and read each line of text
//    if (file.exists()){
        BufferedReader in = null;
//        List<String> dataPoints = new ArrayList<>();
        try {
            in = new BufferedReader(new FileReader(file));//wrapping decorators around file
            String line = in.readLine();
            while (line != null) {
//                dataPoints.add(line);//added due to addition of List above
                System.out.println(line);
                line = in.readLine();  // strips out any carriage return chars
            }

        } catch (IOException ioe) {
            throw ioe;
//            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {

            }
        }
//    } else
//	     System.out.println("File not found: test.txt");
    } // end main
} // end class

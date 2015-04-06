package ioexamples;

import java.io.*;
import java.util.*;

/**
 * TextWriterApp.java	1.00 Nov 25, 2003
 *
 * A class that writes data to a text file, with buffering.
 */
public class TextWriterApp{
	
   public static void main(String[] args) throws IOException{
   	  boolean append = true;   // you can change this. if set to true, it will automatically append to your file

	  // This references the file in the working directory
	  File data = new File("src" + File.separatorChar + "test.out");
	  		
      // This is where we setup our streams (append = false means overwrite)
      // new FileWriter() creates the file if doesn't exit
	  PrintWriter out = new PrintWriter(
						new BufferedWriter(
						new FileWriter(data, append)));//overwrite is default. if append set to false, it will overwrite--would need the append here.
	  //"out" is just a variable created to make it understood that you are printing out to a file
	  // print statements do actual work of writing data
	  // note that print statements work similar to Sytem.out.println,
	  // where data is converted to strings
	  out.print(5.25);
	  out.print('c');
	  out.print(true);
	  out.println("Java");
	  out.println( new Dog() );
	  out.print("End of file");
	  out.close();  // be sure you close your streams when done!!
	
	  System.out.println("Wrote file to: " + data.getAbsolutePath());
   }
}

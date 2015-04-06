package IOStudentPractice;

import ioexamples.Dog;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author kritterbusch
 */
public class AppendToFile {
    public static void main(String[] args) throws Exception{
        boolean append = true;   

	  
	  File data = new File("C:" + File.separatorChar + "temp" + File.separatorChar + "lab1" + File.separatorChar + "UserInfo.txt");
	  		
      // This is where we setup our streams (append = false means overwrite)
      // new FileWriter() creates the file if doesn't exit
	  PrintWriter out = new PrintWriter(
						new BufferedWriter(
						new FileWriter(data, append)));
          out.println();
	  out.print("Maxtone");
          out.print(" ");
	  out.print("Witherball\n");
          out.print("333 Fishtank Ln\n");
          out.print("Waukesha");
          out.print(", ");
          out.print("WI");
          out.print(" ");
          out.print(53188);
          out.close();
          System.out.println("Wrote file to: " + data.getAbsolutePath());
    }
    }


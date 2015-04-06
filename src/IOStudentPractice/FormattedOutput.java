package IOStudentPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author kritterbusch
 */
public class FormattedOutput {

    public static void main(String[] args) throws IOException {
//             boolean append = false;

        File inFile = new File("C:" + File.separatorChar + "temp" + File.separatorChar + "lab1" + File.separatorChar + "UserInfo.txt");
        File outFile = new File("C:" + File.separatorChar + "temp" + File.separatorChar + "lab1" + File.separatorChar + "Formatted.txt");
        PrintWriter out = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(outFile, false)));

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(inFile));
            String line = "";
            while (line != null) {
                String[] line1 = in.readLine().split(" ");
                out.println("First Name: " + line1[0]);
                out.println("Last Name: " + line1[1]);

                String[] line2 = in.readLine().split(" ");
                out.println("Address: " + line2[0]);
                String street = "";
                for (int i = 1; i < line2.length; i++) {
                    street = street.concat(line2[i] + " ");
                }
                out.println("Street: " + street);

                String[] line3 = in.readLine().split(",");
                out.println("City: " + line3[0]);
                line3 = line3[1].split(" ");
                out.println("State: " + line3[1]);
                out.println("Zip: " + line3[2]);
                out.println("\n");
                line = in.readLine();
            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } finally {
            try {
                in.close();
                out.close();
            } catch (Exception e) {

            }
        }
    }
}

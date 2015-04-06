package IOStudentPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author kritterbusch
 */
public class ConsoleOutput {

    public static void main(String[] args) throws Exception {
        File file = new File("C:" + File.separatorChar + "temp" + File.separatorChar + "lab1" + File.separatorChar + "UserInfo.txt");

        BufferedReader in = null;
//        List<String> dataPoints = new ArrayList<>();
        try {
            in = new BufferedReader(new FileReader(file));
            String line = in.readLine();
            while (line != null) {
//                dataPoints.add(line);//added due to addition of List above
                System.out.println(line);
                line = in.readLine();
            }

        } catch (IOException ioe) {
            throw ioe;

        } finally {
            try {
                in.close();
            } catch (Exception e) {

            }
        }
    }
}

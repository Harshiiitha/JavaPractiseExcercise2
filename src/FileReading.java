import java.util.Scanner;
import java.io.*;
public class FileReading {
        public static void main(String[] input)
        {
            String fname;
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter File Name to Open (with extension like file.txt) : ");
            fname = scan.nextLine();

            String line = null;
            try
            {
                /* FileReader reads text files in the default encoding */
                FileReader fileReader = new FileReader(fname);

                /* always wrap the FileReader in BufferedReader */
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while((line = bufferedReader.readLine()) != null)
                {

                    String upper = line.toUpperCase();
                    System.out.println(upper);
                }

                /* always close the file after use */
                bufferedReader.close();
            }
            catch(IOException ex)
            {
                System.out.println("Error reading file named '" + fname + "'");
            }
        }
    }


import java.io.*;
import java.util.Scanner;

class NumWriteDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Source File Path");
        String path = scanner.next();
        System.out.println("Enter odd file path");
        String oddpath = scanner.next();
        System.out.println("Enter even file path");
        String evenpath = scanner.next();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            BufferedWriter oddwriter = new BufferedWriter(new FileWriter(oddpath));//File to which only odd numbers has to be written
            BufferedWriter evenwriter = new BufferedWriter(new FileWriter(evenpath));//File to which only even numbers has to be written
            String line = reader.readLine();
            while (line != null) {
                int num = Integer.parseInt(line);
                if (num % 2 == 1) {
                    oddwriter.write(line + "\n");
                } else {
                    evenwriter.write(line + "\n");
                }
                line = reader.readLine();
            }
            reader.close();
            oddwriter.close();
            evenwriter.close();
            System.out.println("Completed File Write");
        } catch (Exception e) {
            System.out.println("Unable to open the file");
        }
    }
}

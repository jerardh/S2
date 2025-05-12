import java.io.FileOutputStream;
import java.util.Scanner;

public class FileManage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter filename");
        String fileName = scanner.nextLine();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            System.out.println("Enter the file content");
            String content = scanner.next();
            fileOutputStream.write(content.getBytes());
            System.out.println(content);
        } catch (Exception e) {
            System.out.println("Unable to create file");
        }

    }
}

import java.io.File;
import java.util.Scanner;

class DirectoryListing {
    static boolean fileFound = false;
    static String filePath = "";

    static void listFilesAndDirectories(File directory) {
        if (directory.isDirectory()) {
            File[] filesanddir = directory.listFiles();
            System.out.println("Files under " + directory.getName());
            for (File fildir : filesanddir) {
                System.out.println(fildir.getName());
                listFilesAndDirectories(fildir);
            }
        }
    }

    static void searchFile(File file, String fileName) {
        if (!fileFound) {
            File[] files = file.listFiles();
            for (File insidefile : files) {
                if (insidefile.isFile()) {
                    if (insidefile.getName().equals(fileName)) {
                        filePath = insidefile.getPath();
                        fileFound = true;
                        return;
                    }
                } else {
                    searchFile(insidefile, fileName);
                }
            }
        }

    }
}

public class SubDirAndFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter directory path:");
        String dirpath = scanner.next();
        File directory = new File(dirpath);
        if (directory.isDirectory()) {
            System.out.println("Files and directories");
            DirectoryListing.listFilesAndDirectories(directory);
            System.out.println("Enter filename to be searched");
            String fileName = scanner.next();
            DirectoryListing.searchFile(directory, fileName);
            if (DirectoryListing.fileFound) {
                System.out.println("File Path=" + DirectoryListing.filePath);
            } else {
                System.out.println("File Not found");
            }
        } else {
            System.out.println("Not a valid directory");
        }
    }
}

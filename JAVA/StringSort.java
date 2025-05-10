import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        String[] strs;
        int n;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of strings");
        n = s1.nextInt();
        strs = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter string " + i + ":");
            strs[i] = s1.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                //returns 0 if strings are equal
                //>0 if 1st string is larger
                //<0 if 2nd string is larger
                if (strs[j].compareTo(strs[j + 1]) >= 0) {
                    String temp = strs[j];
                    strs[j] = strs[j + 1];
                    strs[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Strings");
        for (String s : strs) {
            System.out.println(s);
        }
    }
}

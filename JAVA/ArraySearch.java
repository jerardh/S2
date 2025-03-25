import java.util.Scanner;

class ArraySearch {
    public static void main(String[] args) {
        int n, num, index = -1;
        int[] a;
        boolean flag = false;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter array size:");
        n = s1.nextInt();
        a = new int[n];
        System.out.println("Enter the elements\n");
        for (int i = 0; i < n; i++) {
            a[i] = s1.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        num = s1.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == num) {
                flag = true;
                index = i;
            }
        }
        if (flag) {
            System.out.println("Number found at index " + index);
        } else {
            System.out.println("\nElement not present");
        }

    }
}
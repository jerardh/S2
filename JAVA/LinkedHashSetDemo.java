import java.util.*;

public class LinkedHashSetDemo {
    Set<String> set;

    LinkedHashSetDemo() {
        set = new LinkedHashSet<>();
    }

    void add(String s) {
        set.add(s);
    }

    void remove(String s) {
        set.remove(s);
    }

    boolean contains(String s) {
        return (set.contains(s));
    }

    void display() {
        System.out.println("Elements are" + "\n");
        for (String s : set) {
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        LinkedHashSetDemo obDemo = new LinkedHashSetDemo();
        String temp;
        int op;
        while (flag) {
            System.out.println("\n1.INSERT\n2.DELETE\n3.SEARCH\n4.DISPLAY\n5.EXIT");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Enter the element to be inserted:");
                    temp = scanner.next();
                    obDemo.add(temp);
                    System.out.println("Element added");
                    break;
                case 2:
                    System.out.println("Enter the element to be deleted:");
                    temp = scanner.next();
                    obDemo.remove(temp);
                    System.out.println("Element deleted");
                    break;
                case 3:
                    System.out.println("Enter the element to be searched:");
                    temp = scanner.next();
                    if (obDemo.contains(temp)) {
                        System.out.println("Element present");
                    } else {
                        System.out.println("Element is not present");
                    }
                    break;
                case 4:
                    obDemo.display();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }

}

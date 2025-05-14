
import java.util.ArrayList;
import java.util.Scanner;

class GStack<T> {

    ArrayList<T> stack;
    int size;

    public GStack(int size) {
        this.size = size;
        stack = new ArrayList<T>();
    }

    void push(T element) {
        if (stack.size() < size) {
            stack.add(element);
        } else {
            System.out.println("Stack Overflow");
        }
    }

    T pop() {
        if (stack.size() == 0) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            T element = stack.remove(stack.size() - 1);
            return element;
        }
    }

    void display() {
        System.out.println("Stack elements");
        for (T element : stack) {
            System.out.println(element);
        }
    }
}

class GenericStackDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter stack size");
        int size = scanner.nextInt();
        GStack<Integer> stack = new GStack<>(size);
        boolean flag = true;
        while (flag) {
            System.out.println("1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT\nEnter your option");
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Enter element to be pushed");
                    int ele = scanner.nextInt();
                    stack.push(ele);
                    break;
                case 2:
                    Object p = stack.pop();//Handling null values in case of underflow
                    if (p != null) {
                        //converting to string and parsing to INT
                        System.out.println("Removed element=" + Integer.parseInt(p.toString()));
                    }
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    flag = false;
                    break;

                default:
                    System.out.println("Enter a valid choice");
                    break;
            }

        }
    }
}

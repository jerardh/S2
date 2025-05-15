
import java.util.*;

class CustomQueue {

    Queue<Integer> pq;

    public CustomQueue() {
        pq = new PriorityQueue<Integer>();
    }

    int remove() {
        if (!pq.isEmpty()) {
            return pq.poll();
        } else {
            return -1;
        }
    }

    void add(int element) {
        pq.add(element);

    }

    boolean search(int element) {
        return pq.contains(element);
    }

    int peek() {
        if (!pq.isEmpty()) {
            return pq.peek();
        } else {
            return -1;
        }
    }

    boolean isEmpty() {
        return pq.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("");
        for (int element : pq) {
            res.append(element + " ");
        }
        return res.toString();
    }

}

class QueueDemo {

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        int op, element;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("1.Insert\n2.Delete\n3.Search\n4.Peek\n5.Display\n6.Exit");
            System.out.println("Enter your choice:");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Enter the element:");
                    element = scanner.nextInt();
                    queue.add(element);
                    System.out.println("Inserted");
                    break;
                case 2:
                    element = queue.remove();
                    if (element == -1) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Deleted " + element);
                    }
                    break;
                case 3:
                    System.out.println("Enter the element:");
                    element = scanner.nextInt();
                    if (queue.search(element)) {
                        System.out.println("Element is present");
                    } else {
                        System.out.println("Element is not present");
                    }
                    break;
                case 4:
                    element = queue.peek();
                    if (element == -1) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Element at front " + element);
                    }
                    break;
                case 5:
                    if (!queue.isEmpty()) {
                        System.out.println("Queue elements");
                        System.out.println(queue);
                    } else {
                        System.out.println("Queue is empty");
                    }
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }
    }
}

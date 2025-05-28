
class CustomThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("i=" + i);
        }
    }

}

class CustomThread2 extends Thread {

    @Override
    public void run() {
        for (int j = 100; j < 110; j++) {
            System.out.println("j=" + j);
        }
    }

}

public class ThreadDemo {

    public static void main(String[] args) {
        CustomThread thread = new CustomThread();
        CustomThread2 thread2=new CustomThread2();
        thread.start();
        thread2.start();
    }
}


class CustomThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i=" + i);
        }
    }

}

class RunnableDemo {

    public static void main(String[] args) {
        Thread thread=new Thread(new CustomThread());
        thread.start();
    }
}

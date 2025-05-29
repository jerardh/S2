
class CustomThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i=" + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
            
        }
    }

}

class RunnableDemo {

    public static void main(String[] args) {
        Thread thread = new Thread(new CustomThread());
        thread.start();
        for(int j=100;j<=110;j++){
            System.out.println("j="+j);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}

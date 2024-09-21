package excephandling;

public class ExceptionClass7 extends Thread {

    @Override
    public void run() {
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExceptionClass7 ec7 = new ExceptionClass7();
        ec7.start();
        ec7.interrupt();
    }
}

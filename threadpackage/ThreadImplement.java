package threadpackage;

public class ThreadImplement implements Runnable {
    @Override
    public void run() {
        System.out.println("Run");
    }

    public static void main(String[] args) {
        ThreadImplement ti = new ThreadImplement();
        Thread thread = new Thread(ti);
        thread.start();
    }

}

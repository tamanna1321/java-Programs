package threadpackage;

class ThreadExtend extends Thread {
    public void run() {
        System.out.println("Runnable");
    }

    public static void main(String[] args) {
        ThreadExtend te = new ThreadExtend();
        te.start();
    }
}

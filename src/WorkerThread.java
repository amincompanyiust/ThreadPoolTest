public class WorkerThread implements Runnable{

    String message;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "(Start) message = " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() + "(End)" );

    }

    WorkerThread (String s) {
        this.message = s;
    }

    private void processMessage() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

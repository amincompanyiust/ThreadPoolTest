import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
    public static void main(String[] args) {

        //creating a pool of 5 thread
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 10; i++) {
            Runnable worker = new WorkerThread(""+i);

            //Calling Excecute method of Excecutor service
            executorService.execute(worker);
        }
        executorService.shutdown();

        while (!executorService.isTerminated()) {

        }

        System.out.println("finished all threads!");

    }
}

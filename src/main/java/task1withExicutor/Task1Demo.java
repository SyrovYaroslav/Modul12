package task1withExicutor;
import java.util.concurrent.*;

public class Task1Demo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        executor.scheduleAtFixedRate(new FiveSecondInfo(queue), 0, 5, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(new OneSecondInfo(queue), 0, 1, TimeUnit.SECONDS);

        Thread.sleep(20000);
        executor.shutdown();
    }
}

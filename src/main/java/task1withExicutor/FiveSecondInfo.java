package task1withExicutor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class FiveSecondInfo implements Runnable{

    private BlockingQueue<String> queue = new LinkedBlockingQueue<>();

    public FiveSecondInfo(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        if(queue.size() == 5) {
            System.out.println("Прошло 5 секунд");
            queue.clear();
        }
    }
}

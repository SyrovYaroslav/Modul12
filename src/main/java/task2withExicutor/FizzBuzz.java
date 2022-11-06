package task2withExicutor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class FizzBuzz implements MyProducer{
    int n;
    boolean updated = false;
    BlockingQueue<String> queue = new LinkedBlockingQueue<>();

    @Override
    public void setN(int n,BlockingQueue<String> queue) {
        this.n = n;
        updated = true;
        this.queue = queue;
    }

    @Override
    public boolean isUpdated() {
        return updated;
    }


    @Override
    public void run() {
        while (true) {
            try {
                if(updated) {
                    updated = false;
                    if (n % 15 == 0) {
                        queue.put("fizzbuzz");
                    }
                }
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

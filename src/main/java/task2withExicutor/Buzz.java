package task2withExicutor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Buzz implements Runnable{
    int n;
    BlockingQueue<String> queue = new LinkedBlockingQueue<>();


    public Buzz(int n, BlockingQueue<String> queue) {
        this.n = n;
        this.queue = queue;
    }

    @Override
    public void run() {
        if (n % 5 == 0 && n % 15 !=0) {
            queue.add("buzz");

        }
    }
}
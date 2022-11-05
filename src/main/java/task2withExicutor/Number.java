package task2withExicutor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Number implements Runnable {

    int n;
    BlockingQueue<String> queue = new LinkedBlockingQueue<>();

    public Number(int n, BlockingQueue<String> queue) {
        this.n = n;
        this.queue = queue;
    }
    @Override
    public void run() {
        if (n % 3 != 0 && n % 5 != 0) {
            queue.add(String.valueOf(n));

        }
    }
}

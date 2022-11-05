package task2withExicutor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Fizz implements Runnable{
    int n;
    BlockingQueue<String> queue = new LinkedBlockingQueue<>();


    public Fizz(int n, BlockingQueue<String> queue) {
        this.n = n;
        this.queue = queue;
    }

    @Override
    public void run() {
        if (n % 3 == 0 && n % 15 !=0) {
            queue.add("fizz");

        }
    }
}

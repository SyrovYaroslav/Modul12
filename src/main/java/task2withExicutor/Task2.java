package task2withExicutor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Task2 {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 15; i++) {
            executor.execute(new FizzBuzz(i, queue));
            executor.execute(new Buzz(i, queue));
            executor.execute(new Fizz(i, queue));
            executor.execute(new Number(i, queue));

        }
        while (true) {
            if (!queue.isEmpty()) {
                System.out.println(queue.poll());
            } else {
                break;
            }
        }
        executor.shutdown();
    }
}

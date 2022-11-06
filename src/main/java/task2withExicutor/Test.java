package task2withExicutor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        // збирає елементи для виводу на екран
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        MyProducer fizzProducer = new Fizz();
        MyProducer buzzProduser = new Buzz();
        MyProducer fizzbuzzProduser = new FizzBuzz();
        MyProducer numberProducer = new Number();

        Runnable consumer = () -> {
            while (true) {
                while (!queue.isEmpty()) {
                    System.out.println(queue.poll());
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.execute(numberProducer);
        executor.execute(fizzProducer);
        executor.execute(buzzProduser);
        executor.execute(fizzbuzzProduser);
        executor.execute(consumer);
        for (int i = 1; i <= 20; i++) {
            fizzProducer.setN(i, queue);
            numberProducer.setN(i, queue);
            buzzProduser.setN(i, queue);
            fizzbuzzProduser.setN(i, queue);
            while (fizzProducer.isUpdated() || numberProducer.isUpdated() || buzzProduser.isUpdated() || fizzbuzzProduser.isUpdated()){
                Thread.sleep(100);
            }
        }
        executor.shutdown();
    }
}

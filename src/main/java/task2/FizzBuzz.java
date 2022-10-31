package task2;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class FizzBuzz extends Thread{
    private final Semaphore semaphore;
    private final int n;

    public FizzBuzz(int n, Semaphore semaphore) {
        this.n = n;
        this.semaphore = semaphore;
    }


    public void fizz() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0) {
                System.out.println("fizz");
            }
        }
        semaphore.release();
    }

    public void buzz() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i <= n; i++) {
            if(i % 5 == 0) {
                System.out.println("buzz");
            }
        }
        semaphore.release();
    }

    public void fizzbuzz() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i <= n; i++) {
            if(i % 15 == 0) {
                System.out.println("fizzbuzz");
            }
        }
        semaphore.release();
    }

    public void number() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i <= n; i++) {
            if(i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
        semaphore.release();
    }

}

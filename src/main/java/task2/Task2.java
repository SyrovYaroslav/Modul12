package task2;

import java.util.concurrent.Semaphore;

public class Task2 {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(4);
        new FizzBuzz(15, sem).fizz();
        new FizzBuzz(15, sem).buzz();
        new FizzBuzz(15, sem).fizzbuzz();
        new FizzBuzz(15, sem).number();
    }
}

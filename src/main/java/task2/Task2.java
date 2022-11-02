package task2;
import java.util.function.IntConsumer;

public class Task2 {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        Runnable printFizz = () -> System.out.print("fizz, ");
        Runnable printBuzz = () -> System.out.print("buzz, ");
        Runnable printFizzBuzz = () -> System.out.print("fizzbuzz ");
        IntConsumer printNumber = number -> System.out.print(number + ", ");

        Thread A = new Thread(() -> {
            try {
                fizzBuzz.fizz(printFizz);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread B = new Thread(() -> {
            try {
                fizzBuzz.buzz(printBuzz);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread C = new Thread(()-> {
            try {
                fizzBuzz.fizzbuzz(printFizzBuzz);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread D = new Thread(() -> {
            try {
                fizzBuzz.number(printNumber);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        A.start();
        B.start();
        C.start();
        D.start();
    }
}

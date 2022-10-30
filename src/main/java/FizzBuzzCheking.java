import java.util.ArrayList;
import java.util.stream.Collectors;

public class FizzBuzzCheking {
    private final ArrayList<String> result = new ArrayList<>();

    public void check(int n) {
        for (int i = 1; i <= n; i++) {
            Thread a = new Thread(new Number(i, result));
            Thread b = new Thread(new Fizz(i, result));
            Thread c = new Thread(new Buzz(i, result));
            Thread d = new Thread(new FizzBuzz(i, result));

            a.start();
            b.start();
            c.start();
            d.start();
        }

    }

    public void printResult() {
        String finalResult = result.stream().collect(Collectors.joining(", "));
        System.out.println(finalResult);
    }

}

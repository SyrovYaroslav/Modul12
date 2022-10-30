import java.util.ArrayList;

public class FizzBuzz implements Runnable{
    private int n;
    private ArrayList<String> result = new ArrayList<>();

    public FizzBuzz(int n, ArrayList<String> result) {
        this.n = n;
        this.result = result;
    }

    @Override
    public void run() {
        if (n % 15 == 0) {
            result.add("fizzbuzz");
        }
    }
}

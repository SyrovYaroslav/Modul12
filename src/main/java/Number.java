import java.util.ArrayList;

public class Number implements Runnable{
    private int n;
    private ArrayList<String> result = new ArrayList<>();

    public Number(int n, ArrayList<String> result) {
        this.n = n;
        this.result = result;
    }

    @Override
    public void run() {
        if (n % 3 != 0 && n % 5 != 0) {
            result.add(String.valueOf(n));
        }
    }
}

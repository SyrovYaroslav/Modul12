package task2;

import java.util.ArrayList;

public class Fizz implements Runnable{
    public int n;
    private ArrayList<String> result = new ArrayList<>();

    public Fizz(int n, ArrayList<String> result){
        this.n = n;
        this.result = result;
    }

    @Override
    public void run() {
        if (n % 3 == 0 && n % 15 != 0) {
            result.add("fizz");
        }
    }
}

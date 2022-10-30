package task2;

import java.util.ArrayList;

public class Buzz implements Runnable{
    private int n;
    private ArrayList<String> result = new ArrayList<>();

    public Buzz(int n, ArrayList<String> result) {
        this.n = n;
        this.result = result;
    }

    @Override
    public void run() {
        if (n % 15 != 0 && n % 5 == 0){
            result.add("buzz");
        }
    }
}

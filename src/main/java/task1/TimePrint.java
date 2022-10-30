package task1;

import java.util.Timer;
import java.util.TimerTask;

public class TimePrint implements Runnable{
    private int miliseconds;

    public TimePrint(int  miliseconds) {
        this.miliseconds = miliseconds;
    }
    @Override
    public void run() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                new TaimeCounter().watch();
            }
        }, miliseconds, miliseconds);
    }
}

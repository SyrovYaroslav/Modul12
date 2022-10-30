package task1;

import java.util.Timer;
import java.util.TimerTask;

public class MassagePrint implements  Runnable{
    private int miliseconds;

    public MassagePrint(int  miliseconds) {
        this.miliseconds = miliseconds;
    }
    @Override
    public void run() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                new Massage().printMassage();
            }
        }, miliseconds, miliseconds);
    }
}

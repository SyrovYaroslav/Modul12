package task1withExicutor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class OneSecondInfo implements Runnable{
    private int hour;
    private int min;
    private int sec;
    private BlockingQueue<String> queue = new LinkedBlockingQueue<>();


    public OneSecondInfo(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }


    @Override
    public void run() {
        hour = sec / 3600;
        min = (sec % 3600) / 60;
        sec = sec % 60;
        System.out.println(hour + ":" + min + ":" + sec);
        if (hour > 23) {
            run();
        }
        sec++;
        queue.add(String.valueOf(sec));
    }
}

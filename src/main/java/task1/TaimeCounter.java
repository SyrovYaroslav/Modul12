package task1;

public class TaimeCounter {
    private int hour;
    private int min;
    private int sec;


    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public void watch() {
        for (int i = 1;; i++) {
            hour = i / 3600;
            min = (i % 3600) / 60;
            sec = i % 60;
            System.out.println(hour + ":" + min + ":" + sec);
            if (hour > 23) {
                watch();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package task1;

public class Task1 {

    public static void main(String[] args) {
        TimePrint perOneSecond = new TimePrint(1000);
        Thread time = new Thread(perOneSecond);
        time.start();
        MassagePrint perFiveSecond = new MassagePrint(5000);
        Thread massage = new Thread(perFiveSecond);
        massage.start();
    }
}

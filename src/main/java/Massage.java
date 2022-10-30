public class Massage implements Runnable{
    private int sec;

    public Massage(int sec){
        this.sec = sec;
    }
    @Override
    public void run() {
        if (sec % 5 == 0) {
            System.out.println("Прошло 5 секунд");
        }
    }
}

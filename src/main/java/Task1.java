import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;

public class Task1 {

    public static void main(String[] args) {
        Executor time = Executors.newSingleThreadExecutor();

        ScheduledExecutorService massage = Executors.newSingleThreadScheduledExecutor();

        time.execute(new TaimeCounter());

        massage.scheduleAtFixedRate(
                () -> System.out.println("Прошло 5 секунд"),
                5,
                5,
                TimeUnit.SECONDS
        );




    }
}

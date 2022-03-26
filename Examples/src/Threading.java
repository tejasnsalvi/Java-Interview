import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Threading {

    public static void main(String... args) {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        List<String> list = Arrays.asList("1", "2", "3", "4", "5");


        list.forEach(i -> {

            Runnable runnable = () -> {
                getInt(i);
            };

            executorService.submit(runnable);

        });

        try {
            boolean b = executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    static int getInt(String s) {
        return Integer.valueOf(s);
    }
}

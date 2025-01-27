package ClassLectures.multithreading.syncronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSynchronized {

    public static final int THREAD_COUNT = 10;
    public static final int ITERATIONS = 10_000;

    public static void main(String[] args) {
        final DataHolder dataHolder = new DataHolder();

        try (ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT)) {
            for (int i = 0; i < THREAD_COUNT; i++) {
                executorService.submit(() -> {
                    for (int j = 0; j < ITERATIONS; j++) {
                        dataHolder.increment();
                    }
                });

                /*executorService.submit(new Runnable() {
                    @Override
                    public void run() {
                        for (int j = 0; j < ITERATIONS; j++) {
                            dataHolder.increment();
                        }
                    }
                });*/
            }
        }

        // First run this as it is then add synchronized to the increment method and run again
        System.out.println("Expected value: " + (ITERATIONS * THREAD_COUNT) + ", actual value: " + dataHolder.getData());
    }

}

package ClassLectures.thirtyClass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StringBufferMultiThread {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        ExecutorService executor = Executors.newFixedThreadPool(3); // Create a thread pool with 3 threads

        for (int i = 0; i < 3; i++) {
            executor.execute(new ThreadTask(sb, i));
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
            // Wait for all threads to finish
        }

        System.out.println(sb); // Print the final result (may not be as expected)
    }

    static class ThreadTask implements Runnable {
        StringBuffer sb;
        int threadCount;

        public ThreadTask(StringBuffer sb, int threadCount) {
            this.sb = sb;
            this.threadCount = threadCount;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                sb.append(" World form thread ")
                        .append(threadCount)
                        .append(" and word count ")
                        .append(i);

            }
        }
    }
}
package ClassLectures.multithreading;

public class MultithreadingExtends extends Thread {

    private int threadCount = 420;

    public MultithreadingExtends() {
    }

    public MultithreadingExtends(int threadCount) {
        this.threadCount = threadCount;
    }

    @Override
    public void run() {

        if (threadCount == 420) {

            for (int i = 0; i < 5; i++) {
                System.out.println(i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("Error " + e.getMessage());
                }
            }
        } else {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + " from thread " + threadCount);

                if (threadCount == 3) {
                    throw new RuntimeException("Manually thrown exception for demonstration purposes");
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("Error " + e.getMessage());
                }
            }
        }
    }
}

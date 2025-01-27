package ClassLectures.multithreading;

public class MultithreadingImplements implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Error " + e.getMessage());
            }
        }
    }

}

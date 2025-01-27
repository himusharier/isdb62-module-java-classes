package ClassLectures.multithreading;

public class MultithreadingWithPriority {
    public static void main(String[] args) {

        MultithreadingExtends thread = new MultithreadingExtends();
        // thread.setPriority(7);
        thread.setPriority(Thread.NORM_PRIORITY); // This is the default
        thread.start();
    }
}

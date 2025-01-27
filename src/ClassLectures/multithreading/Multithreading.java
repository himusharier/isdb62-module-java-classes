package ClassLectures.multithreading;

public class Multithreading {

    public static void main(String[] args) {
        /*MultithreadingExtends thread1 = new MultithreadingExtends();
        // Call start to run the thread
        // If we call run directly, the thread will not start. It will execute single threaded
        thread1.start();

        MultithreadingExtends thread2 = new MultithreadingExtends();
        thread2.start();

        // Demonstrate the execution of multiple threads
        for (int i = 0; i < 10; i++) {
            MultithreadingExtends thread3 = new MultithreadingExtends(i);
            thread3.start();
        }*/

        // Demonstrate multithreading with implements
        for (int i = 0; i < 10; i++) {
            MultithreadingImplements thread4 = new MultithreadingImplements();
            thread4.run();
        }

        // Another way to create threads
        for (int i = 0; i < 10; i++) {
            MultithreadingImplements task = new MultithreadingImplements();
            Thread thread = new Thread(task);
            thread.start();
        }

    }
}

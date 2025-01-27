package ClassLectures.multithreading.syncronized;

public class DataHolder {

    private int data;

    public int getData() {
        return data;
    }

    public void increment() {
        data++;
    }

    // Below two methods behave the same. They are both synchronized
    public synchronized void incrementSync() {
        data++;
    }

    public void incrementSync2() {
        // Synchronized block is more preferable cause there may be more code that does not need to be synchronized. e.g.
        // Some code here
        synchronized (this) {
            data++;
        }
        // And some code here
    }

    // Do some R&D on these keywords -> monitor, lock, unlock
}

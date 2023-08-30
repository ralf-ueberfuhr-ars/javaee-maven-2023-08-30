package de.samples.jar1;

public class Counter {

    private static final Counter theInstance = new Counter();
    private long counter = 0;

    public long count() {
        return counter++;
    }

    public static Counter getInstance() {
        return theInstance;
    }

}

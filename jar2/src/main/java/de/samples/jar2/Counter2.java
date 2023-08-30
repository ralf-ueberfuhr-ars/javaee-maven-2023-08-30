package de.samples.jar2;

public class Counter2 {

    private static final Counter2 theInstance = new Counter2();
    private long counter = 0;

    public long count() {
        return counter++;
    }

    public static Counter2 getInstance() {
        return theInstance;
    }

}

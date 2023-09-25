package org.launchcode;

public abstract class BaseDisc {

    private static int capacity;
    private static final int rpm;
    private static String title;
    private static final String type;

    public abstract String spinDisc();


    @Override
    public String toString() {
        return "The capacity of this disc is " + capacity +
                "The speed of this disc is " + rpm +
                "The media on this disc is called " + title +
                "This disc is a " + type;
    }
}

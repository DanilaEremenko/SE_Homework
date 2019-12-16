package model;

import java.util.Date;

public class CurrentTime {
    private final int hours;
    private final int minutes;
    private final int seconds;

    public CurrentTime(long millis) {
        Date dateTime = new Date(millis);
        this.hours = dateTime.getHours();
        this.minutes = dateTime.getMinutes();
        this.seconds = dateTime.getSeconds();
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}

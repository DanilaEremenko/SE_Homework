package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.lang.NonNull;

public class RemainingTime {
    private int days;
    private int hours;
    private int minutes;
    private int seconds;
    private String exception;

    //Example: 2020-12-31
    public RemainingTime(@NonNull final String deadline) {
        long millis = 0;
        try {
            millis = getDiffMillis(deadline);

            this.seconds = (int) ((millis/1000) % 60);
            this.minutes = (int) ((millis/1000/60) % 60);
            this.hours = (int) ((millis/(1000*60*60)) % 24);
            this.days = (int) (millis/(1000*60*60*24));
            this.exception = "";
        } catch (ParseException e) {
            this.seconds = 0;
            this.minutes = 0;
            this.hours = 0;
            this.days = 0;
            this.exception = "Wrong format. Use \'2020-12-31\'";
        }
    }

    private long getDiffMillis(@NonNull final String deadline) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date deadDateTime = dateFormat.parse(deadline);
        Date currentDateTime = new Date();
        Date dateTime = new Date(deadDateTime.getTime() - currentDateTime.getTime());

        return dateTime.getTime();
    }

    public String getException() {
        return exception;
    }

    public int getDays() {
        return days;
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

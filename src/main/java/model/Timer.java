package model;

import java.text.ParseException;

import org.springframework.lang.NonNull;

public class Timer {

    public static CurrentTime getCurrentTime() {
        return new CurrentTime(System.currentTimeMillis());
    }

    public static RemainingTime getRemainingTime(@NonNull final String deadline) {
        return new RemainingTime(deadline);
    }
}

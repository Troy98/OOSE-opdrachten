package nl.han.dea.http;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class HttpDate {
    public static String getHttpDate() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return dateFormat.format(calendar.getTime());
    }

    public static void main(String[] args) {
        System.out.println("HTTP Date: " + getHttpDate());
    }
}
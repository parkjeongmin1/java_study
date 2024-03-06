package ch12.sec08;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZoneID {
    public static void main(String[] args) {
        String[] availableIDs = TimeZone.getAvailableIDs();
        for (String id : availableIDs){
            System.out.println(id);
        }
        TimeZone timeZone = TimeZone.getTimeZone("Africa/Abidjan");
        Calendar now = Calendar.getInstance(timeZone);
    }
}

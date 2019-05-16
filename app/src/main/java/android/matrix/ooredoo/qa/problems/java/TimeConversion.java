package android.matrix.ooredoo.qa.problems.java;

public class TimeConversion {

    static String timeConversion(String time) {
        int hour = Integer.parseInt(time.substring(0,2));
        int minute = Integer.parseInt(time.substring(3,5));
        int second = Integer.parseInt(time.substring(6,8));
        String meridiem = time.substring(8,10);

        hour += ((meridiem.equals("PM") && hour != 12)?12:0);//Performs conversion based on current meridiem
        hour -= ((meridiem.equals("AM") && hour == 12)?12:0);

        return String.format("%02d",hour) + ":" + String.format("%02d",minute) + ":" + String.format("%02d",second);

    }
}

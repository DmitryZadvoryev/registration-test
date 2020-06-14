package util;

import java.time.LocalDate;

/**
 * This class creates current invite code
 */
public class InviteCode {

    private static StringBuilder sb = new StringBuilder();

    public static String getCurrentInviteCode() {
        LocalDate now = LocalDate.now();
        sb.append(now.getYear())
                .append(getNumberOfMonth(now.getMonthValue()))
                .append(now.getDayOfMonth());
        return sb.toString();
    }

    public static String getNumberOfMonth(int value) {
        if (value < 10) {
            return "0" + value;
        } else {
            return String.valueOf(value);
        }
    }
}

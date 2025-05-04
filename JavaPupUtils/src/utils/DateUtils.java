package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    /**
     * Checks if a given date string is in the specified format.
     *
     * @param dateStr the date string to check
     * @param pattern the expected date format (e.g., "yyyy-MM-dd")
     * @return true if the date string is in the specified format, false otherwise
     */
    // 這個方法用來檢查日期字串是否符合指定的格式
    public static boolean isValidDateFormat(String dateStr, String pattern) {
        if (dateStr == null || dateStr.trim().isEmpty()) {
            return false;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        sdf.setLenient(false); // 嚴格檢查
        try {
            Date date = sdf.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     * Parses a date string into a Date object using the specified format.
     *
     * @param dateStr the date string to parse
     * @param pattern the expected date format (e.g., "yyyy-MM-dd")
     * @return the parsed Date object, or null if parsing fails
     */
    // 這個方法用來將日期字串解析為 Date 物件
    public static Date parseDate(String dateStr, String pattern) {
        if (!isValidDateFormat(dateStr, pattern)) {
            return null;
        }
        try {
            return new SimpleDateFormat(pattern).parse(dateStr);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * Checks if a given year is a leap year.
     *
     * @param year the year to check
     * @return true if the year is a leap year, false otherwise
     */
    // 這個方法用來檢查年份是否為閏年
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

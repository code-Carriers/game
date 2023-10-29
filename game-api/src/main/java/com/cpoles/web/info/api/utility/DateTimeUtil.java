package com.cpoles.web.info.api.utility;

import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtil {

    public static Long getUnixTimeStamp() {
        return System.currentTimeMillis();
    }

    public static String getUnixTimeStampString() {
        return Long.toString(System.currentTimeMillis());
    }

    public static LocalDateTime convertToDateTimeDefaultNow(String value, String pattern) {
        LocalDateTime result = convertToDateTime(value, pattern);
        return null != result ? result : LocalDateTime.now();
    }

    public static LocalDateTime convertToDateDefaultToday(String value) {
        String dateTimeString = getDateTimeString(value);
        LocalDateTime result = convertToDateTime(dateTimeString);
        return null != result ? getDate(result) : getToday();
    }


    public static LocalDateTime convertToDateTime(String value) {
        if (StringUtils.isEmpty(value)) return null;

        try {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            return LocalDateTime.parse(getDateTimeString(value), dateTimeFormatter);
        } catch (Exception e) {
            return null;
        }
    }

    public static LocalDateTime convertToDateTime(String value, String pattern) {
        try {
            if (StringUtils.isEmpty(value) || StringUtils.isEmpty(pattern)) return null;

            int patternLength = pattern.length();
            if (!pattern.contains("'T'") && pattern.contains("T")) {
                pattern = pattern.replace("T", "'T'");
                patternLength = patternLength - 2;
            } else if (pattern.contains("'T'")) {
                patternLength = patternLength - 2;
            }

            String dateString = value.length() > patternLength ? value.substring(0, patternLength) : value;
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
            return LocalDateTime.parse(dateString, dateTimeFormatter);
        } catch (Exception e) {
            return null;
        }
    }

    public static boolean isDateTime(String value) {
        if (StringUtils.isEmpty(value)) return false;

        try {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime.parse(getDateTimeString(value), dateTimeFormatter);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isEqual(LocalDateTime dt1, LocalDateTime dt2) {
        if (dt1 == null && dt2 == null) return true;
        if (dt1 == null || dt2 == null) return false;
        return dt1.isEqual(dt2);
    }


    private static String getDateTimeString(String value) {
        if (StringUtils.isEmpty(value)) return "";

        //Pre
        String dateString = value.trim().replace("T", " ").replaceAll("-", "/");
        if (dateString.contains("+")) dateString = StringUtil.getSplitValue(dateString, "+", 0);
        if (dateString.contains(".")) dateString = StringUtil.getSplitValue(dateString, ".", 0);

        String[] dateTimeArray = dateString.split("\\s+");
        String result;

        //Date
        String[] dateArray = dateTimeArray[0].split("/");
        if (dateArray.length != 3) return value;

        result = (dateArray[0].length() == 2 ? "20" : "") + dateArray[0];
        result += "/" + (dateArray[1].length() == 1 ? "0" : "") + dateArray[1];
        result += "/" + (dateArray[2].length() == 1 ? "0" : "") + dateArray[2];

        //Time
        if (dateTimeArray.length == 1) {
            result += " 00:00:00";
        } else {
            String[] timeArray = dateTimeArray[1].split(":");

            if (timeArray.length > 0)
                result += " " + (timeArray[0].length() == 1 ? "0" : "") + timeArray[0];
            else
                result += " 00";

            if (timeArray.length > 1)
                result += ":" + (timeArray[1].length() == 1 ? "0" : "") + timeArray[1];
            else
                result += ":00";

            if (timeArray.length > 2)
                result += ":" + (timeArray[2].length() == 1 ? "0" : "") + timeArray[2];
            else
                result += ":00";
        }

        return result;
    }

    public static String getTodayString(String pattern) {
        if (StringUtils.isEmpty(pattern)) return "";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(new Date());
    }

    public static String getFormatString(LocalDateTime value, String pattern) {
        if (value == null || StringUtils.isEmpty(pattern)) return "";

        DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
        return value.format(df);
    }

    public static LocalDateTime getDate(LocalDateTime value) {
        if (value == null) return null;
        return value.withHour(0).withMinute(0).withSecond(0).withNano(0);
    }

    public static LocalDateTime getToday() {
        return LocalDateTime.now().withHour(0).withMinute(0).withSecond(0).withNano(0);
    }

    public static Date localDateTime2Date(LocalDateTime localDateTime) {
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdt = localDateTime.atZone(zoneId);//Combines this date-time with a time-zone to create a  ZonedDateTime.
        return Date.from(zdt.toInstant());
    }

    public static int getDistanceDays(Date date1, Date date2) {
        Calendar aCalendar = Calendar.getInstance();
        aCalendar.setTime(date1);
        int day1 = aCalendar.get(Calendar.DAY_OF_YEAR);
        aCalendar.setTime(date2);
        int day2 = aCalendar.get(Calendar.DAY_OF_YEAR);
        return Math.abs(day2 - day1);
    }

    public static LocalDateTime getFirstDayOfMonth(LocalDateTime value) {
        if (value == null) return null;
        return value.withDayOfMonth(0).withHour(0).withMinute(0).withSecond(0).withNano(0);
    }
}

package com.cpoles.web.info.api.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {

    private static final String REGEX_MOBILE = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
    private static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    public static boolean isEmail(String value) {
        return Pattern.compile(REGEX_EMAIL).matcher(value).matches();
    }

    public static boolean isMobile(String value) {
        return Pattern.compile(REGEX_MOBILE).matcher(value).matches();
    }

    public static String getMatchString(String value, String pattern) {
        try {
            Pattern patternInstance = Pattern.compile(pattern);
            Matcher matcher = patternInstance.matcher(value);
            return matcher.find() ? matcher.group(1) : "";
        } catch (Exception e) {
            return "";
        }
    }

    public static List<String> getMatchStrings(String value, String pattern) {
        List<String> result = new ArrayList<>();
        try {
            Pattern patternInstance = Pattern.compile(pattern);
            Matcher matcher = patternInstance.matcher(value);
            while (matcher.find()) {
                result.add(matcher.group(1));
            }
            return result;
        } catch (Exception e) {
            return result;
        }
    }

    public static boolean matches(String value, String pattern) {
        try {
            Pattern patternInstance = Pattern.compile(pattern);
            Matcher matcher = patternInstance.matcher(value);
            return matcher.matches();
        } catch (Exception e) {
            return false;
        }
    }
}

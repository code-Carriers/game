package com.cpoles.web.info.api.utility;

import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.regex.Pattern;

public class NumberUtil {

    public static BigDecimal toBigDecimalDefaultZero(String value) {
        BigDecimal result = toBigDecimal(value);
        return null != result ? result : BigDecimal.ZERO;
    }

    public static BigDecimal toBigDecimal(String value) {
        try {
            return new BigDecimal(value);
        } catch (Exception e) {
            return null;
        }
    }

    public static int toInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (Exception e) {
            return 0;
        }
    }

    public static boolean isPositiveInteger(String value) {
        String regexString = "[0-9]*";
        return !StringUtils.isEmpty(value) && Pattern.compile(regexString).matcher(value).matches();
    }

    public static String toString(BigDecimal value) {
        return toString(value, 2);
    }

    public static String toString(BigDecimal value, int newScale) {
        return value == null ? "" : value.setScale(newScale, BigDecimal.ROUND_HALF_UP).toString();
    }

    public static String toString(Integer value) {
        return value == null ? "" : String.valueOf(value);
    }
}

package com.cpoles.web.info.api.utility;

import java.security.MessageDigest;

public class ShaUtil {

    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String getCheckSum(String value) {
        return encode(value);
    }

    public static String getShaString(String clearString) {
        try {

            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] sha = messageDigest.digest(clearString.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : sha) sb.append(String.format("%02X", b));

            return sb.toString().toLowerCase();

        } catch (Exception e) {
            throw new RuntimeException("系统内部错误,请联系系统管理员!");
        }
    }

    private static String encode(String value) {
        if (value == null) {
            return null;
        }

        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(value.getBytes());
            return getFormattedText(messageDigest.digest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String getFormattedText(byte[] bytes) {
        int len = bytes.length;
        StringBuilder sb = new StringBuilder(len * 2);
        for (byte aByte : bytes) {
            sb.append(HEX_DIGITS[(aByte >> 4) & 0x0f]);
            sb.append(HEX_DIGITS[aByte & 0x0f]);
        }
        return sb.toString();
    }
}
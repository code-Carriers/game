package com.cpoles.web.info.api.utility;

import org.springframework.util.StringUtils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.regex.Pattern;

@SuppressWarnings("unused")
public class StringUtil {
    public static String EncodingGBK(String value) {
        try {
            return new String(value.getBytes("GBK"), "GBK");
        } catch (Exception ex) {
            return "";
        }
    }

    public static String removeNullString(String value) {
        if (StringUtils.isEmpty(value)) return "";
        return value.replace("\"null\"", "").trim();
    }

    public static String removeEnter(String value) {
        if (StringUtils.isEmpty(value)) return "";
        return value
                .replaceAll("\t", "")
                .replaceAll("[\r|\n]", "").trim();
    }

    public static String removeRedundancySpace(String value) {
        return StringUtils.isEmpty(value) ? "" : value.replaceAll("\\s+", " ").trim();
    }

    public static String convertToUuid(String value) {
        if (StringUtils.isEmpty(value)) return "";

        value = value.trim();
        if (value.length() != 32) return value;

        return value.substring(0, 8) + '-' + value.substring(8, 12) + '-' + value.substring(12, 16) + '-' + value.substring(16, 20) + '-' + value.substring(20);
    }

    public static String convertXmlSpecialChar(String value) {
        if (StringUtils.isEmpty(value)) return "";

        value = value.trim();
        value = StringUtils.replace(value, "&", "&amp;");
        value = StringUtils.replace(value, "<", "&lt;");
        value = StringUtils.replace(value, ">", "&gt;");
        value = StringUtils.replace(value, "'", "&apos;");
        value = StringUtils.replace(value, "\"", "&quot;");

        return value;
    }

    public static String left(String value, int length) {
        if (StringUtils.isEmpty(value)) return "";
        if (value.length() <= length) return value;
        return value.substring(0, length);
    }

    public static String trim(String value) {
        return StringUtils.isEmpty(value) ? "" : value.trim();
    }

    public static String removeNull(String value) {
        if (StringUtils.isEmpty(value)) return "";
        return "null".equals(value.toLowerCase()) || "n/a".equals(value.toLowerCase()) ? "" : value.trim();
    }

    public static String toString(String value) {
        return (StringUtils.isEmpty(value)) ? "" : value.trim();
    }

    public static String combine(String value1, String value2, String separator) {
        return combine(value1, value2, "", separator);
    }

    public static String combine(String value1, String value2, String value3, String separator) {
        value1 = toString(value1);
        value2 = toString(value2);
        value3 = toString(value3);

        String result = value1;

        if (!StringUtils.isEmpty(result) && !StringUtils.isEmpty(value2)) result += separator;
        result += value2;

        if (!StringUtils.isEmpty(result) && !StringUtils.isEmpty(value3)) result += separator;
        result += value3;

        return result;
    }

    public static boolean isForeignChar(String value) {
        if (StringUtils.isEmpty(value)) return false;

        for (int i = 0; i < value.length(); i++) {
            int c = value.charAt(i);
            if (!(c >= 0x0020 && c <= 0x007F) && (c != 160) && !(c >= 0x0391 && c <= 0xFFE5)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNullString(String value) {
        if (isBlank(value)) return true;
        return "null".equals(value.toLowerCase().trim());
    }

    public static boolean isBlank(String str) {
        int strLen;
        if (str != null && (strLen = str.length()) != 0) {
            for (int i = 0; i < strLen; ++i) {
                // 判断字符是否为空格、制表符、tab
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    public static boolean isEqual(String value1, String value2) {
        if (value1 == null && value2 == null) return true;
        if (value1 == null) return false;
        return value1.equals(value2);
    }

    public static String getSplitBefore(String value, String separator) {
        if (StringUtils.isEmpty(value)) return "";
        if (StringUtils.isEmpty(separator)) return value;

        int pos = value.indexOf(separator);
        return pos <= 0 ? "" : value.substring(0, pos);
    }

    public static String getSplitEnd(String value, String separator) {
        if (StringUtils.isEmpty(value)) return "";
        if (StringUtils.isEmpty(separator)) return value;

        int pos = value.lastIndexOf(separator);
        return pos <= 0 ? "" : value.substring(pos + separator.length());
    }

    public static String getSplitValue(String value, String regex, int index) {
        String[] values = value.split(regex);
        return values.length > index ? values[index] : "";
    }

    public static String getBase64String(String value) {
        try {
            return Base64.getEncoder().encodeToString(value.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            return "";
        }
    }

    public static String getBase64String(byte[] value) {
        try {
            return Base64.getEncoder().encodeToString(value);
        } catch (Exception e) {
            return "";
        }
    }

    public static byte[] getBase6Array(String value) {
        try {
            return Base64.getDecoder().decode(value);
        } catch (Exception e) {
            return null;
        }
    }

    public static String getSubstring(String value, int beginIndex, int endIndex) {
        if (StringUtils.isEmpty(value)) return "";
        if (beginIndex < 0 || endIndex > value.length()) return "";
        return value.substring(beginIndex, endIndex).trim();
    }

    public static String removeHtmlTag(String value) {
        if (StringUtils.isEmpty(value)) return "";

        value = value.replaceAll("&nbsp;", "");

        return value;
    }

    public static String getFileExtension(String value) {
        int index = value.lastIndexOf(".");
        if (index == -1) return "";

        return value.substring(index + 1).toUpperCase();
    }

    public static String getSqlParameter(String value) {
        if (isBlank(value)) return "";
        return value.trim().replaceAll(";", "").replaceAll("%", "");
    }

    public static String getSqlLikeParameter(String value) {
        if (isBlank(value)) return "";
        value = value.trim().replaceAll(";", "").replaceAll("%", "");
        return "%" + value + "%";
    }

    public static String formatNewsContent(String value, String language) {

        // 移除空格
        value = value.replace("&nbsp;", " ");
        value = value.replace("\r", "").replace("\n", "").replace("\t", "");
        value = value.replace("　", "").replace("  ", " ");
        value = value.replaceAll(">\\s<", "><");
        // 移除样式
        value = value.replaceAll("style=\"[^\"]*\"", "");
        // 移除Div的样式
        value = value.replaceAll("<div[^>]*", "<div");
        // 移除回车
        value = value.replaceAll("<br[^>]*>", "<div>");
        value = value.replaceAll("<p[^>]*>", "<div>");
        value = value.replace("</p>", "</div>");
        // 移除span
        value = value.replaceAll("<span[^>]*>", "");
        value = value.replace("</span>", "");
        // 移除多余的strong
        value = value.replaceAll("(<strong></strong>)+", "");
        value = value.replaceAll("(<b></b>)+", "");
        // 移除多余的回车
        value = value.replaceAll("(<div>)+", "<div>");
        value = value.replaceAll("</div>", "");
        //value = value.replaceAll("(<div></div>)+", "");
        // 处理图片
        value = value.replaceAll("([^>])<img", "$1<div><img");
        // 分段处理
        StringBuilder result = new StringBuilder();
        String[] rows = value.split("<div>");
        for (String row : rows) {
            row = row.trim();
            if (StringUtils.isEmpty(row)) continue;
            if (row.startsWith("<img")) {
                result.append(String.format("<p align = \"center\">%s</p>\n", row));
            } else if ("EN".equals(language) || "英文".equals(language)) {
                result.append(String.format("<p>%s</p>\n", row));
            } else {
                result.append(String.format("<p>　　%s</p>\n", row));
            }
        }
        //返回
        return result.toString();
    }
}
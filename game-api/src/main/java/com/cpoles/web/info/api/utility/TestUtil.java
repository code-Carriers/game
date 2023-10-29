package com.cpoles.web.info.api.utility;

public class TestUtil {

    /*public static void main(String[] args) {
        try {
            String value = "<div style=\"font-family: 宋体, SimSun; font-size: 12px;\"><span style=\"font-size: 14px;\">12月25日，科考船&ldquo;深海一号&rdquo;顺利靠泊深圳蛇口太子湾邮轮母港，与21日靠泊的&ldquo;大洋号&rdquo;一起再次呈现双船同靠的盛况。<br /><br />&nbsp;&nbsp;临近岁末，受全球新冠疫情冲击的航运业正逐步恢复，邮轮或科考船舶陆续选择蛇口太子湾邮轮母港挂靠，完成船员换班或物资补给。此次科考船双船同靠太子湾邮轮母港，再次彰显邮轮母港和招商邮服一站式优质服务的吸引力。船舶在港期间，招商邮服快速、准确地完成各项船舶和船员进出港手续，并按照船方要求及时安排物资补给。招商邮服专业的服务和热情的态度得到船方的称赞。<br /><br />&nbsp;&nbsp;在即将过去的2020年，招商邮服克服新冠疫情的不利影响，主动迎难而上，苦练内功，抓住客流调整期，与邮轮母港一起，改造码头设施，优化服务流程，在危机中孕育新局，为邮轮市场复苏做好准备。<br /><br /></span></div>\n" +
                    "<div style=\"text-align: center;\"><img style=\"border: none;\" src=\"http://www.penavicosz.com.cn/78/37/edit_file/Image/2020/12/29/2020122916271539.jpg\" alt=\"\" width=\"600\" height=\"450\" /></div>\n" +
                    "<p>&nbsp;</p>\n" +
                    "<div style=\"font-family: 宋体, SimSun; font-size: 12px; text-align: center;\"><span style=\"font-size: 14px;\"><br /></span><img style=\"border: none;\" src=\"http://www.penavicosz.com.cn/78/37/edit_file/Image/2020/12/29/2020122916272978.jpg\" alt=\"\" width=\"600\" height=\"317\" /></div>";

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
            value = value.replaceAll("<span[^>]*>", "<div>");
            value = value.replace("</span>", "</div>");
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
                } else {
                    result.append(String.format("<p>　　%s</p>\n", row));
                }
            }

            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

}

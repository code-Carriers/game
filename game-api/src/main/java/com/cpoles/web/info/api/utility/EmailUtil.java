package com.cpoles.web.info.api.utility;

import org.springframework.util.StringUtils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@SuppressWarnings("SameParameterValue")
public class EmailUtil {

    private static final String EMAIL_HOST_DEFAULT = "smtp.qiye.163.com";
    private static final String SEND_BY_DEFAULT = "noreply_2@penavicosz.com.cn";
    private static final String SEND_PASSWORD_DEFAULT = "vvyfw73ESfXod468";

    private static void sendEmail(String sendBy,
                                  List<String> toEmails,
                                  String subject,
                                  String content) {

        Properties props = System.getProperties();

        // 设置邮件服务器
        props.put("mail.smtp.host", EmailUtil.EMAIL_HOST_DEFAULT);

        // 取得session
        props.put("mail.smtp.auth", "true"); // 这样才能通过验证
        EmailAuthenticator emailAuthenticator = new EmailAuthenticator(sendBy, EmailUtil.SEND_PASSWORD_DEFAULT);
        Session session = Session.getInstance(props, emailAuthenticator);
        session.setDebug(true);

        // 定义message
        MimeMessage message = new MimeMessage(session);
        try {
            // 设定发送邮件的地址
            message.setFrom(new InternetAddress(sendBy));

            for (String email : toEmails) {
                if (!StringUtils.isEmpty(email)) {
                    // 设定接受邮件的地址
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
                }
            }

            // 设定邮件主题
            message.setSubject(subject);

            // 设定邮件内容
            BodyPart mdp = new MimeBodyPart();// 新建一个存放信件内容的BodyPart对象
            mdp.setContent(content, "text/html;charset=gbk");// 给BodyPart对象设置内容和格式/编码方式
            Multipart mm = new MimeMultipart();// 新建一个MimeMultipart对象用来存放BodyPart对象(事实上可以存放多个)
            mm.addBodyPart(mdp);// 将BodyPart加入到MimeMultipart对象中(可以加入多个BodyPart)
            message.setContent(mm);// 把mm作为消息对象的内容
            message.saveChanges();

            Transport.send(message);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void sendEmail(String to,
                                 String subject,
                                 String content) {
        List<String> toEmails = new ArrayList<>();
        toEmails.add(to);
        sendEmail(SEND_BY_DEFAULT, toEmails, subject, content);
    }
}

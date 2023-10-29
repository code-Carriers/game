package com.cpoles.web.info.api.utility;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

@SuppressWarnings("WeakerAccess")
public class EmailAuthenticator extends Authenticator {

    private String strUser;
    private String strPwd;

    public EmailAuthenticator(String user, String password) {
        this.strUser = user;
        this.strPwd = password;
    }

    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(strUser, strPwd);
    }
}

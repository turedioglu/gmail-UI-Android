package com.example.gmailprojectui;

import android.widget.ImageView;

public class Gmail {




    private int img;
    private String mailTitle;
    private String mailSubject;
    private String mailBody;
    private String mailDate;


    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setMailTitle(String mailTitle) {
        this.mailTitle = mailTitle;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }

    public void setMailBody(String mailBody) {
        this.mailBody = mailBody;
    }

    public void setMailDate(String mailDate) {
        this.mailDate = mailDate;
    }

    public String getMailTitle() {
        return mailTitle;
    }

    public String getMailSubject() {
        return mailSubject;
    }

    public String getMailBody() {
        return mailBody;
    }

    public String getMailDate() {
        return mailDate;
    }




    public Gmail(int img,String mailTitle, String mailSubject, String mailBody, String mailDate){

        this.img = img;
        this.mailTitle = mailTitle;
        this.mailSubject = mailSubject;
        this.mailBody = mailBody;
        this.mailDate = mailDate;
    }
}


package com.company;

public class Situation {
    Situation[] direction;
    String subject,text;
    int dK,dA,dR;

    public Situation(String subject, String text, int variants, int dk,int da,int dr) {

        this.subject = subject;
        this.text = text;
        dK = dK;
        dA = dA;
        dR = dR;
        direction = new Situation[variants];
    }
}

package main.java.dependencyInversionPrinciple.wrongExp;

public class Notification {

    private Email email = new Email();
    private SMS sms = new SMS();

    public void sender(){
        email.sendEmail();
        sms.sendSms();
    }
}

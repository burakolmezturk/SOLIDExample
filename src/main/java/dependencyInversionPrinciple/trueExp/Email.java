package main.java.dependencyInversionPrinciple.trueExp;

public class Email implements IMessage{

    public void sendEmail(){

    }

    @Override
    public void sendMessage() {
        sendEmail();
    }
}

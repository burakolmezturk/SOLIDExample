package main.java.dependencyInversionPrinciple.trueExp;

public class SMS implements IMessage{
    public void sendSms() {

    }

    @Override
    public void sendMessage() {
        sendSms();
    }
}

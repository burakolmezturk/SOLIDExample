package main.java.dependencyInversionPrinciple.trueExp;

import main.java.dependencyInversionPrinciple.wrongExp.Email;
import main.java.dependencyInversionPrinciple.wrongExp.SMS;

import java.util.ArrayList;
import java.util.List;

public class Notification {

    private IMessage message;

    public void sender() {

        message.sendMessage();

    }
}

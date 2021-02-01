package main.java.liskovSubstitutionPrinciple.wrongExp;

public abstract class Car {
    public String run() {
        return "Engine started";
    }

    public abstract String openAirConditioning();

    public abstract String gearUp();
}

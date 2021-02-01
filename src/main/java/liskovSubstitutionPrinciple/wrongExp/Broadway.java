package main.java.liskovSubstitutionPrinciple.wrongExp;

public class Broadway extends Car{
    @Override
    public String openAirConditioning() {
        return "Broadway has not air conditioning";
    }

    @Override
    public String gearUp() {
        return "Gear up";
    }
}

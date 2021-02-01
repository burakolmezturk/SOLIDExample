package main.java.liskovSubstitutionPrinciple.wrongExp;

public class Mercedes extends  Car{

    @Override
    public String openAirConditioning() {
        return "Air conditioning opened";
    }

    @Override
    public String gearUp() {
        return "Gear up";
    }
}

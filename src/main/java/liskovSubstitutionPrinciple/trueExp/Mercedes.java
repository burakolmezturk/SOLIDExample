package main.java.liskovSubstitutionPrinciple.trueExp;

public class Mercedes extends Car implements IOpenAirConditioning,IGearUp {
    @Override
    public String gearUp() {
        return "Successful";
    }

    @Override
    public String openAirConditioning() {
        return "Successful";
    }
}

package main.java.liskovSubstitutionPrinciple.trueExp;

public class Broadway extends Car implements IGearUp{
    @Override
    public String gearUp() {
        return "Successful";
    }
}

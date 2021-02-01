package main.java.openClosedPrinciple.wrongExp;

public class OperationService {

    public double calculate(Object object){
         double result=0;
         if(object instanceof Addition){
            result = ((Addition) object).getNumber1() + ((Addition) object).getNumber2();
         }else if(object instanceof  Multiplication){
             result = ((Multiplication) object).getNumber1() * ((Multiplication) object).getNumber2();
         }
         return  result;
    }
}

package level2.exercise3.mainManager;

import level2.exercise3.dataClass.NumberFloat;
import level2.exercise3.interfaces.Operation;
import level2.exercise3.logic.ManagerNumberFloat;

import java.util.List;
import java.util.stream.Collectors;

public class MainNumberFloat {
    public static void main(String[] args) {
        ManagerNumberFloat managerNumberFloat = new ManagerNumberFloat();
        managerNumberFloat.loadNumber();

        List<NumberFloat> number = managerNumberFloat.getNumberFloatList();

        Operation addition = (a , b)-> a + b;
        Operation subtraction = (a,b)->a - b;
        Operation division = (a, b)->b !=0 ? a / b : 0;
        Operation multiply = (a , b)->a * b;

       for (int i = 0; i < number.size() -1; i +=2 ) {
           float a = number.get(i).getNumber();
           float b = number.get(i + 1).getNumber();


           System.out.println("Addition: " + addition.operationMath(a, b));
           System.out.println("Subtraction: " + subtraction.operationMath(a, b));
           System.out.println("Division: " + division.operationMath(a, b));
           System.out.println("Multiplication: " + multiply.operationMath(a, b));
       }
    }
}

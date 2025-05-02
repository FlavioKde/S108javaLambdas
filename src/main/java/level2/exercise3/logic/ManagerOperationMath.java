package level2.exercise3.logic;

import level2.exercise3.interfaces.Operation;


public class ManagerOperationMath {
    private ManagerNumberFloat managerNumberFloat;

    public ManagerOperationMath(ManagerNumberFloat managerNumberFloat) {
        this.managerNumberFloat = managerNumberFloat;
    }

    public void OperationMath() {


        Operation addition = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;
        Operation division = (a, b) -> b != 0 ? a / b : 0;
        Operation multiply = (a, b) -> a * b;

            for(int i = 0; i < managerNumberFloat.getNumberFloatList().size() -1; i +=2){
                float a = managerNumberFloat.getNumberFloatList().get(i);
                float b = managerNumberFloat.getNumberFloatList().get(i + 1);


            System.out.println("Addition: " + addition.operationMath(a, b));
            System.out.println("Subtraction: " + subtraction.operationMath(a, b));
            System.out.println("Division: " + division.operationMath(a, b));
            System.out.println("Multiplication: " + multiply.operationMath(a, b));
        }
    }
}
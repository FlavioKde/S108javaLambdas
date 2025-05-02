package level2.exercise3.mainManager;

import level2.exercise3.logic.ManagerNumberFloat;
import level2.exercise3.logic.ManagerOperationMath;



public class MainNumberFloat {
    public static void main(String[] args) {
        ManagerNumberFloat managerNumberFloat = new ManagerNumberFloat();
        ManagerOperationMath managerOperationMath = new ManagerOperationMath(managerNumberFloat);
        managerOperationMath.OperationMath();


    }
}

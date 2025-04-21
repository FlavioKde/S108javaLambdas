package level1.exercise4.mainManager;

import level1.exercise3.logic.ManagerMonths;

public class MainMonths {

    public static void main(String[] args) {
        ManagerMonths result = new ManagerMonths();
        result.loadMonths();
        result.select();
    }
}

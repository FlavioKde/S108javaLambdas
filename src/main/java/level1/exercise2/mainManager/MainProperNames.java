package level1.exercise2.mainManager;

import level2.exercise1.logic.ManagerProperNames;

public class MainProperNames {
    public static void main(String[] args) {
        ManagerProperNames manager = new ManagerProperNames();
        manager.loadNames();
        manager.return_3_letter_names();
    }
}

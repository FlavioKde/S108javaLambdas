package level2.exercise4.mainManager;

import level2.exercise4.logic.ManagerElement;

public class MainElement {
    public static void main(String[] args) {
        ManagerElement manager = new ManagerElement();
        manager.loadElement();
        manager.order();
    }
}

package level1.exercise6.mainManager;

import level1.exercise6.logic.ManagerChain;

public class MainChain {
    public static void main(String[] args) {
        ManagerChain manager = new ManagerChain();
        manager.loadChain();
        manager.executeLambda();

    }
}

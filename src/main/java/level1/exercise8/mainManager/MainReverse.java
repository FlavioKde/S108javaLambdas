package level1.exercise8.mainManager;

import level1.exercise8.logic.ManagerPhrase;
import level1.exercise8.logic.ManagerPhraseReverse;

public class MainReverse {
    public static void main(String[] args) {
        ManagerPhrase managerPhrase = new ManagerPhrase();
        managerPhrase.loadPhrase();
        ManagerPhraseReverse managerPhraseReverse = new ManagerPhraseReverse(managerPhrase);
        managerPhraseReverse.loadLambda();


    }
}
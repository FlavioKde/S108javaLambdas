package level1.exercise8.mainManager;

import level1.exercise8.interfaces.ReverseString;
import level1.exercise8.logic.ManagerPhrase;

public class MainReverse {
    public static void main(String[] args) {
        ManagerPhrase managerPhrase = new ManagerPhrase();
        managerPhrase.loadPhrase();


        ReverseString example = string -> new StringBuilder(string).reverse().toString();

        String phrase = managerPhrase.getPhraseList().get(0).getPhraseReverse();

        String examplePhrase = example.reverse(phrase);

        System.out.println(examplePhrase);
    }
}

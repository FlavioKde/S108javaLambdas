package level1.exercise8.logic;

import level1.exercise8.interfaces.ReverseString;

public class ManagerPhraseReverse {
    private ManagerPhrase managerPhrase;

    public ManagerPhraseReverse(ManagerPhrase managerPhrase){
        this.managerPhrase = managerPhrase;
    }

    public void loadLambda(){
        ReverseString example = string -> new StringBuilder(string).reverse().toString();

        if (!managerPhrase.getPhraseList().isEmpty()) {
            String phrase = managerPhrase.getPhraseList().get(0).getPhraseReverse();

            String examplePhrase = example.reverse(phrase);

            System.out.println(examplePhrase);
        } else {
            System.out.println("The list is empty, there are no phrases to reverse.");
        }

    }
}

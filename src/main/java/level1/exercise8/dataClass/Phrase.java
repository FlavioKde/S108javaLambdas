package level1.exercise8.dataClass;

public class Phrase {
    private String phraseReverse;

    public Phrase(String phraseReverse){
        this.phraseReverse = phraseReverse;
    }

    public String getPhraseReverse() {
        return phraseReverse;
    }

    @Override
    public String toString() {
        return "Phrase: " + phraseReverse;
    }
}

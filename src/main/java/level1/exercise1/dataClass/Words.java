package level1.exercise1.dataClass;

public class Words {
    private String word;

    public Words(String word){
        this.word = word;
    }

    public String getWord() {
        return word != null ? word: " ";
    }

    @Override
    public String toString() {
        return "Words: " +"\n"+
                "word: " + word ;
    }
}

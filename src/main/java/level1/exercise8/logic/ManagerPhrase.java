package level1.exercise8.logic;

import level1.exercise8.dataClass.Phrase;

import java.util.ArrayList;
import java.util.List;

public class ManagerPhrase {
    private List<Phrase>phraseList;

    public ManagerPhrase(){
        this.phraseList = new ArrayList<>();
    }

    public List<Phrase> getPhraseList() {
        return phraseList;
    }
    public void loadPhrase(){
        phraseList.add(new Phrase("Hello, my name is Flavio and I " +
                "come from Argentina. I really like animals."));
    }

    @Override
    public String toString() {
        return "ManagerPhrase: " +"\n"+
                "phraseList= " + phraseList;
    }
}

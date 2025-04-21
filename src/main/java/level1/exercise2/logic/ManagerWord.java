package level1.exercise2.logic;

import level1.exercise2.dataClass.Words;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerWord {
    private List<Words>words;

    public ManagerWord(){
        this.words = new ArrayList<>();
    }

    public List<Words> getWords() {
        return words;
    }
    public void loadWoords(){
        words.add(new Words("House"));
        words.add(new Words("Ocean"));
        words.add(new Words("Robot"));
        words.add(new Words("Wind"));
        words.add(new Words("Pork"));
        words.add(new Words("Pink"));
        words.add(new Words("Sky"));
        words.add(new Words("Gold"));
        words.add(new Words("Morning"));
        words.add(new Words("Notebook"));

    }

    public void selectOAndLength(){
       List<Words> result = this.words.stream()
                .filter(word->word.getWord().toLowerCase().contains("o"))
                .filter(word->word.getWord().length() >=5)
                .collect(Collectors.toList());
        result.forEach(word-> System.out.println("Word-> " +word.getWord()));

    }

}

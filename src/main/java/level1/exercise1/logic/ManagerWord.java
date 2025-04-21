package level1.exercise1.logic;

import level1.exercise1.dataClass.Words;

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

    public void selectO(){
        this.words.stream()
                .filter(word->word.getWord().toLowerCase().contains("o"))
                .forEach(System.out::println);


    }
}

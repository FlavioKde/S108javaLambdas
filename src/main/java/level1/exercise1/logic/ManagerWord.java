package level1.exercise1.logic;

import level1.exercise1.dataClass.Words;

import java.util.ArrayList;
import java.util.List;



public class ManagerWord {
    private List<Words>words;

    public ManagerWord(){
        this.words = new ArrayList<>();
    }

    public void loadWords(){
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
                .map(Words::getWord )
                .forEach(System.out::println);


    }
}

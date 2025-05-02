package level1.exercise6.logic;

import level1.exercise6.dataClass.Chain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ManagerChain {
    private List<Chain> chains;

    public ManagerChain() {
        this.chains = new ArrayList<>();
    }

    public void loadChain() {
        chains.add(new Chain("Hey"));
        chains.add(new Chain(23));
        chains.add(new Chain("Octopus"));
        chains.add(new Chain("Table"));
        chains.add(new Chain("Hey"));
        chains.add(new Chain(86));
        chains.add(new Chain("Jude"));
        chains.add(new Chain(233345));
        chains.add(new Chain("Pink"));
        chains.add(new Chain("Red"));
        chains.add(new Chain(678));
        chains.add(new Chain(93));

    }
    public void executeLambda(){
        this.chains.stream()
                .map(chain -> chain.getChain().toString())
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

    }

}

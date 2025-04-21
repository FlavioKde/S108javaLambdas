package level1.exercise6.logic;

import level1.exercise6.dataClass.Chain;

import java.util.ArrayList;
import java.util.List;

public class ManagerChain<T> {
    private List<Chain> chains;

    public ManagerChain() {
        this.chains = new ArrayList<>();
    }

    public void loadChain() {
        chains.add(new Chain<>("Hey"));
        chains.add(new Chain<>(23));
        chains.add(new Chain<>("Octopus"));
        chains.add(new Chain<>("Table"));
        chains.add(new Chain<>("Hey"));
        chains.add(new Chain<>(86));
        chains.add(new Chain<>("Jude"));
        chains.add(new Chain<>(233345));
        chains.add(new Chain<>("Pink"));
        chains.add(new Chain<>("Red"));
        chains.add(new Chain<>(678));
        chains.add(new Chain<>(93));

    }
    public void executeLambda(){
        this.chains.stream()
                .filter(chain -> chain.getChain() instanceof String)
                .map(chain -> ((String) chain.getChain()))
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                .forEach(System.out::println);

    }

}

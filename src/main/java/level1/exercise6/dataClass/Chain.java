package level1.exercise6.dataClass;

public class Chain<T> {
    private T chain;

    public Chain(T chain){
        this.chain = chain;
    }

    public T getChain() {
        return chain;
    }

    @Override
    public String toString() {
        return "Chain " +"\n"+
                "chain=" + chain;
    }
}

package level1.exercise7.dataClass;

public class Chain {
    private Object chain;

    public Chain(Object chain){
        this.chain = chain;
    }

    public Object getChain() {
        return chain;
    }

    @Override
    public String toString() {
        return "Chain " +"\n"+
                "chain=" + chain;
    }
}

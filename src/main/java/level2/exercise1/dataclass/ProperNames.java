package level2.exercise1.dataclass;

public class ProperNames {
    private String name;

    public ProperNames(String name){
        this.name = name ;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ProperNames: " +"\n"+
                "name= " + name ;
    }
}

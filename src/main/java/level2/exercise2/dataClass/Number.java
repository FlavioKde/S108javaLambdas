package level2.exercise2.dataClass;

public class Number {
    private int numberInt;

    public Number(int number){
        this.numberInt = number;
    }

    public int getNumberInt() {
        return numberInt;
    }

    @Override
    public String toString() {
        return "NumberList: "  + "\n"+
                "number=" + numberInt ;
    }
}

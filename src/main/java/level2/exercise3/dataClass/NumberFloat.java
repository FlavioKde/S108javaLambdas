package level2.exercise3.dataClass;

public class NumberFloat {
    private float number;

    public NumberFloat(float number){
        this.number = number;
    }

    public float getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "NumberFloat " +"\n"+
                "number=" + number;
    }
}

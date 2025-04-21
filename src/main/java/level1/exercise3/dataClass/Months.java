package level1.exercise3.dataClass;


public class Months {
    private String month;

    public Months(String month){
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return "Months: " + "\n"+
                "month='" + month ;
    }
}

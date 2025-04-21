package level1.exercise4.dataClass;


public class Months {
    private String month;

    public Months(String month){
        this.month = month;
    }

    public String getMonth() {
        return month !=null ? month :" ";
    }

    @Override
    public String toString() {
        return "Months: " + "\n"+
                "month='" + month ;
    }
}

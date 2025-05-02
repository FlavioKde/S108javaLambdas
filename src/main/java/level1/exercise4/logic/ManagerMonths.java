package level1.exercise4.logic;

import level1.exercise4.dataClass.Months;

import java.util.ArrayList;
import java.util.List;


public class ManagerMonths {
    private List<Months> months;


    public ManagerMonths() {
        this.months = new ArrayList<>();

    }

    public void loadMonths(){
        months.add(new Months("January"));
        months.add(new Months("February"));
        months.add(new Months("March"));
        months.add(new Months("April"));
        months.add(new Months("May"));
        months.add(new Months("June"));
        months.add(new Months("July"));
        months.add(new Months("August"));
        months.add(new Months("September"));
        months.add(new Months("October"));
        months.add(new Months("November"));
        months.add(new Months("December"));
    }


    public void select(){

        months.stream().map(Months::getMonth).forEach(System.out::println);
    }
}

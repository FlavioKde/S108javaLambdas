package level1.exercise3.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import level1.exercise3.dataClass.Months;

public class ManagerMonths {
    private List<Months> months;

    public ManagerMonths(){
        this.months = new ArrayList<>();
    }

    public List<Months> getMonths() {
        return months;
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
        List<Months> result =this.months.stream()
              //  .filter(month->month.getMonth())
                .collect(Collectors.toList());
        result.forEach(month->System.out.println("Months of the year "+ month.getMonth()));

    }
}

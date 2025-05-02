package level1.exercise3.logic;

import java.util.List;


public class ManagerMonths {

    private List<String> months;
    public ManagerMonths(){

        this.months = List.of("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");
    }

    public void select(){

        months.forEach(System.out::println);
    }
}

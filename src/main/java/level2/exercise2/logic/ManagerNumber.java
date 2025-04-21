package level2.exercise2.logic;

import level2.exercise2.dataClass.Number;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerNumber {
    private List<Number>numberList;

    public ManagerNumber(){
        this.numberList = new ArrayList<>();
    }

    public List<Number> getNumberList() {
        return numberList;
    }
    @Override
    public String toString(){
        return getNumberList()+ " , ";
    }
    public void loadNumber(){
        numberList.add(new Number(3));
        numberList.add(new Number(5));
        numberList.add(new Number(2));
        numberList.add(new Number(34));
        numberList.add(new Number(21));
        numberList.add(new Number(7));
        numberList.add(new Number(8));
        numberList.add(new Number(9));
        numberList.add(new Number(10));
        numberList.add(new Number(11));
    }
    public void number_preceded_by_letter(){
        List<String> result = this.numberList.stream()
                .map(number -> (number.getNumberInt() % 2 == 0 ? "e":"o")+number.getNumberInt())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}

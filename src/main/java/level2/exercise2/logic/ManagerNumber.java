package level2.exercise2.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerNumber {
    private List<Integer>numberList;


    public ManagerNumber(){
        this.numberList = new ArrayList<>(List.of(3,5,2,34,21,7,8,9,10,11));
    }

    public void number_preceded_by_letter(){
        List<String> result = this.numberList.stream()
                .map(numberList-> (numberList % 2 == 0 ? "e":"0") + numberList)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}

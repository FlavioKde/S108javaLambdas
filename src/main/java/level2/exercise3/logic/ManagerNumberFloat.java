package level2.exercise3.logic;

import level2.exercise3.dataClass.NumberFloat;
import java.util.ArrayList;
import java.util.List;

public class ManagerNumberFloat {
    private List<NumberFloat>numberFloatList;

    public ManagerNumberFloat(){
        this.numberFloatList = new ArrayList<>();
    }

    public List<NumberFloat> getNumberFloatList() {
        return numberFloatList;
    }
    public void loadNumber(){
        numberFloatList.add(new NumberFloat(23.8f));
        numberFloatList.add(new NumberFloat(54.6f));
        numberFloatList.add(new NumberFloat(23.5f));
        numberFloatList.add(new NumberFloat(23.1f));
        numberFloatList.add(new NumberFloat(10.0f));
        numberFloatList.add(new NumberFloat(8.0f));
        numberFloatList.add(new NumberFloat(6.0f));
        numberFloatList.add(new NumberFloat(23.9f));
        numberFloatList.add(new NumberFloat(11.2f));
        numberFloatList.add(new NumberFloat(12.59f));
    }

}

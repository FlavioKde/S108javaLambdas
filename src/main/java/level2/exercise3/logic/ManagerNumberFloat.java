package level2.exercise3.logic;

import java.util.ArrayList;
import java.util.List;

public class ManagerNumberFloat {

      private  List<Float>numberFloatList;
    public ManagerNumberFloat(){
        this.numberFloatList = new ArrayList<>(List.of(23.8f, 54.6f, 10.01f,
                8.02f,34.45f,10.05f, 23.7f, 12.45f, 9.12f, 6.05f));
    }

    public List<Float> getNumberFloatList() {
        return numberFloatList;
    }

}

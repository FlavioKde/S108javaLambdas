package level2.exercise1.logic;

import level2.exercise1.dataclass.ProperNames;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerProperNames {
    private List<ProperNames>properNamesList;

    public ManagerProperNames(){
        this.properNamesList = new ArrayList<>();
    }
    public void loadNames(){
        properNamesList.add(new ProperNames("Flavio"));
        properNamesList.add(new ProperNames("Nim"));
        properNamesList.add(new ProperNames("Marta"));
        properNamesList.add(new ProperNames("Rosario"));
        properNamesList.add(new ProperNames("Ana"));
        properNamesList.add(new ProperNames("Adriano"));
        properNamesList.add(new ProperNames("Ian"));
        properNamesList.add(new ProperNames("Ari"));
        properNamesList.add(new ProperNames("Luchi"));
        properNamesList.add(new ProperNames("Emi"));
    }
    public void return_3_letter_names(){
        List<ProperNames> result = this.properNamesList.stream()
                .filter(properNames -> properNames.getName().startsWith("A") && properNames.getName().length() == 3)
                .collect(Collectors.toList());
        result.forEach(properNames -> System.out.println("Proper name: ->"+properNames.getName()));

    }
}

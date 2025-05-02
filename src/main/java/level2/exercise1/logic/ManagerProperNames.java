package level2.exercise1.logic;


import java.util.List;
import java.util.stream.Collectors;

public class ManagerProperNames {
    private List<String >properNamesList;

    public ManagerProperNames(){
        this.properNamesList = List.of("Flavio", "Nim", "Marta",
                "Rosario", "Ana", "Adriano","Ian","Ari","Luchi","Emi");
    }

    public void return_3_letter_names(){
        List<String> result = this.properNamesList.stream()
                .filter(properNamesList->properNamesList.startsWith("A") && properNamesList.length() ==3)
                .collect(Collectors.toList());
        result.forEach(properNamesList -> System.out.println("Proper name: ->"+ properNamesList));

    }
}

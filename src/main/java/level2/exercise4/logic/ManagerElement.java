package level2.exercise4.logic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerElement {
    List<Object>elementList;

    public ManagerElement(){
        this.elementList = new ArrayList<>(List.of("Emi", 1234,"23",
                "Natalia", 3456, "Entrada", 12, "Marcela", "Listo"));
    }

    public void order(){
        List<Object> sortedByFirstChar = this.elementList.stream().
                sorted(Comparator.comparing(elementList->elementList.toString().charAt(0)))
                .collect(Collectors.toList());
        System.out.println(sortedByFirstChar);


        List<Object> sortedByEPresence = this.elementList.stream()
                .sorted((a, b) -> {
                    boolean aHasE = a.toString().toLowerCase().contains("e");
                    boolean bHasE = b.toString().toLowerCase().contains("e");
                    return Boolean.compare(!aHasE, !bHasE);
                })
                .collect(Collectors.toList());
        System.out.println(sortedByEPresence);


        List<Object> modifiedList = this.elementList.stream()
                .map(elementList->elementList.toString().replace("a","4"))
                .collect(Collectors.toList());
        System.out.println(modifiedList);


        List<Object> numericElements = this.elementList.stream()
                .filter(elementList->elementList.toString().toLowerCase().matches("\\d+"))
                .collect(Collectors.toList());
        System.out.println(numericElements);

    }
}

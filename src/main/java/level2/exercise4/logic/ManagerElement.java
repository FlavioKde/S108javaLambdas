package level2.exercise4.logic;

import level2.exercise4.dataClass.Element;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerElement {
    List<Element>elementList;

    public ManagerElement(){
        this.elementList = new ArrayList<>();
    }

    public List<Element> getElementList() {
        return elementList;
    }
    public void loadElement(){
        elementList.add(new Element<>("Emil"));
        elementList.add(new Element<>(32));
        elementList.add(new Element<>(28));
        elementList.add(new Element<>("Eucalipto"));
        elementList.add(new Element<>("Nim"));
        elementList.add(new Element<>("Emilio"));
        elementList.add(new Element<>("Entrada"));
        elementList.add(new Element<>("1234"));
        elementList.add(new Element<>(2345));
        elementList.add(new Element<>(34567));
    }
    public void order(){
        List<Element> sortedByFirstChar = this.elementList.stream().
                sorted(Comparator.comparing(element -> element.getValue().toString().charAt(0)))
                .collect(Collectors.toList());
        System.out.println(sortedByFirstChar);


        List<Element> sortedByEPresence = this.elementList.stream()
                .filter(element -> element.getValue().toString().toLowerCase().contains("e"))
                .collect(Collectors.toList());
        System.out.println(sortedByEPresence);


        List<Element> modifiedList = this.elementList.stream()
                .map(element -> new Element(element.getValue().toString().replace("a","4")))
                .collect(Collectors.toList());
        System.out.println(modifiedList);


        List<Element> numericElements = this.elementList.stream()
                .filter(element -> element.getValue().toString().toLowerCase().matches("\\d+"))
                .collect(Collectors.toList());
        System.out.println(numericElements);

    }
}

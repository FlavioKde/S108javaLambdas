package level1.exercise5.mainManager;

import level1.exercise5.interfaces.PiValue;

public class MainPi {
    public static void main(String[] args) {

        PiValue number = () -> 3.1418;

        System.out.println("The PI valur is: " + number.getPiValue());
    }
}

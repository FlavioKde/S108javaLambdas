package level3.exercise1.mainManager;

import level3.exercise1.logic.ManagerStudent;

public class MainStudent {
    public static void main(String[] args) {
        ManagerStudent manager = new ManagerStudent();
        manager.loadStudent();

        System.out.println("------------------------");
        System.out.println("Filter with name and age");
        manager.nom_age_filter();

        System.out.println("------------------------");
        System.out.println("Filter with name and A");
        manager.nom_with_a();

        System.out.println("-------------------------");
        System.out.println("students with a grade higher than 5");
        manager.notes_more_than_5();

        System.out.println("--------------------------");
        System.out.println("students with a grade higher than 5 who are not from PHP");
        manager.notes_more_than_5_who_are_not_from_PHP();

        System.out.println("--------------------------");
        System.out.println("students who study JAVA and are of legal age");
        manager.students_from_java();

    }
}
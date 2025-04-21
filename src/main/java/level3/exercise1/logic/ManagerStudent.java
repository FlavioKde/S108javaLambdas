package level3.exercise1.logic;

import level3.exercise1.dataClass.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerStudent {
    private List<Student>studentList;

    public ManagerStudent(){
        this.studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }
    public void loadStudent(){
        studentList.add(new Student("Nim",45,"Java",8));
        studentList.add(new Student("Pau",34,"PHP",5));
        studentList.add(new Student("George",15,"Java",4));
        studentList.add(new Student("Micki",55,"JavaScript",3));
        studentList.add(new Student("Maria",25,"PHP",2));
        studentList.add(new Student("Angie",46,"HTML",9));
        studentList.add(new Student("Luc",38,"Java",8));
        studentList.add(new Student("Anastasia",29,"PHP",1));
        studentList.add(new Student("Filomena",31,"Java",3));
        studentList.add(new Student("Flor",28,"Java",4));
    }
    public void nom_age_filter(){
        this.studentList.stream()
                .forEach(student -> System.out.println("Student: "+"\n"+"Name: " +student.getName()+"\n"+"Age: "+student.getAge()));

    }

    public void nom_with_a(){
        List<Student> result = this.studentList.stream()
                .filter(student -> student.getName().toLowerCase().startsWith("a"))
                .collect(Collectors.toList());

                 List<Student> filteredStudents = new ArrayList<>(result);

        filteredStudents.forEach(student -> System.out.println("Student with name starting with letter A "+ student.getName()));
    }
    public void notes_more_than_5(){
        List<Student> result = this.studentList.stream()
                .filter(student -> student.getNotes() >=5)
                .collect(Collectors.toList());
        result.forEach(student -> System.out.println("Name:" + student.getName() + ", Notes: " + student.getNotes()));
    }
    public void notes_more_than_5_who_are_not_from_PHP(){
        List<Student> result = this.studentList.stream()
                .filter(student -> student.getNotes() >=5 && !student.getCourse().contains("PHP"))
                .collect(Collectors.toList());
        result.forEach(student -> System.out.println("Name:" + student.getName() + ", Course: " + student.getCourse()));
    }
    public void students_from_java(){
        List<Student> result = this.studentList.stream()
                .filter(student -> student.getAge() >=18 && student.getCourse().toLowerCase().equalsIgnoreCase("Java"))
                .collect(Collectors.toList());
        result.forEach(student -> System.out.println("Name:" + student.getName() + ", Course: " + student.getCourse() +", Age: " + student.getAge()));
    }

}

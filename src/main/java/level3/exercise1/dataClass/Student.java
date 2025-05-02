package level3.exercise1.dataClass;


public class Student {
    private String name;
    private int age;
    private String course;
    private int notes;

    public Student(String name, int age, String course, int notes){
        this.name = name;
        this.age = age;
        this.course = course;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public int getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", notes=" + notes +
                '}';
    }
}

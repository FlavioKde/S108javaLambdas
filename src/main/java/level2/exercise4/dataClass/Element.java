package level2.exercise4.dataClass;

public class Element<T> {
    private T value;


    public Element(T value){
        this.value = value;

    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Element: " +
                "value=" + value ;
    }
}

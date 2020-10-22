import java.util.ArrayList;

public class Student {
    public long id;
    public String name;
    public ArrayList<Integer> grades;

    public Student (long id, String name) {
        this.id = id;
        this.name = name;
        grades = new ArrayList<>();
    }
}

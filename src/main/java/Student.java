import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name){
        this.id = id;
        this.name = name;
        grades = new ArrayList<>();
    }

   public long getId(){
        return id;
   }

    public Object getName(){
        return name;
    }

    public void addGrades() {

    }

    public ArrayList<Integer> getGrades(){
        return grades;
    }
}

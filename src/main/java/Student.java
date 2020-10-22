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

    public void addGrades(int grade) {
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades(){
        return grades;
    }

    public double getGradeAverage() {
        double total = 0;
        for(int grade : this.getGrades()) {
            total += grade;
        }
        return total / this.getGrades().size();
    }
}

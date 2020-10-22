import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }


    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for (int grade: this.grades) {
            sum += grade;
        }
        return sum / this.grades.size() ;

}
}

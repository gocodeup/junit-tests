import java.util.ArrayList;
import java.util.List;

public class Student {

    public long id;
    public String name;
    public ArrayList<Integer> grades;

    public Student(long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // returns the student's id
    public long getId() {
        return this.id;
    }
    // returns the student's name
    public String getName() {
        return this.name;
    }
    // adds the given grade to the grades list
    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(ArrayList<Integer> grades) {
        Integer sum = 0;
        if(!grades.isEmpty()) {
            for (Integer mark : grades) {
                sum += mark;
            }
            return sum.doubleValue() / grades.size();
        }
        return sum;
    }

}

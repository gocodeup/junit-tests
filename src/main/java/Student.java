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

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverage() {
        double total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }
}

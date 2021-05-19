import java.util.ArrayList;

public class Student {
    public String name;
    public long id;
    public ArrayList<Integer> grades;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            total += this.grades.get(i);
        }
        double finalAvg = total / this.grades.size();
        return finalAvg;
    }
}

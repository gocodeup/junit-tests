import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private long id;
    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public String getName() {
        return this.name;
    }
    public long getId() {
        return this.id;
    }
    public void addGrades(int grade) {
        this.grades.add(grade);
    }
    public double getAverage() {
        double gradeTotal = 0;
        for (double grad : grades) {
            gradeTotal += grad;
        } return gradeTotal/grades.size();
    }

    public double updateGrade(Integer num, int index){
        return this.getGrades().set(index, num);
    }

    public void removeGrade(int index){
        this.getGrades().remove(index);
    }

}

import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long studentID, String studentName){
        this.id = studentID;
        this.name = studentName;
        this.grades = new ArrayList<>();
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int newGrade){
        this.grades.add(newGrade);
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public double getGradeAverage(){
        double gradeCompile = 0;
        for (Integer grade: this.grades){
            gradeCompile += grade;
        }
        return gradeCompile/this.grades.size();
    }

}

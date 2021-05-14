package junittesting;

import java.util.ArrayList;
import java.util.List;

public class Student{
    public long id;
    public String name;
    public List<Integer> grades;

    public long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    public List<Integer> getGrades(){
        return this.grades;
    }
    public double getGradeAverage(){
        int sum = 0;
        for (int grade : this.grades){
            sum += grade;
        }
        return (double) sum / (double) this.grades.size();
    }
}


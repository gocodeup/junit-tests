import java.util.ArrayList;
import java.util.Collection;

public class Student {

    long id;
    String name ;
    ArrayList<Integer> grades;

    //Constructor
    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    // returns the student's id
    public long getId(){
        return this.id;
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
            grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double bucket = 0;
        for(int grade : this.grades) {
            bucket += grade;
        }
        return bucket/grades.size();
       // int averGrade = grades.getGrades()/ grades.size;
    }

    // updated the grades in the grade list
    public void addGrade(){

    }

    // delete Grade from the grade list
    public void deleteGrade(){

    }


}

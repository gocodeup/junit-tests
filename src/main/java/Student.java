import java.util.ArrayList;
import java.util.List;

public class Student {
    private long id;
    private String name;
    private List<Integer> grades;


    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        //do not need outside information
        //parameters set need outside information..
        // id and name.. no outside info for grades
        this.grades = new ArrayList<>();
    }

    //default constructor call blank student
    public Student() {
        //blank student needed to initialize empty arrayList
        this.grades = new ArrayList<>();
    }

    //METHODZ MAN
    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }
    //Getting average grade in list
    public double getGradeAverage(List<Double> gradeAverage) {
        double sum = 0;
        for(int i = 0; i < gradeAverage.size(); i++) {
            sum += gradeAverage.get(i);
        }
        return sum / gradeAverage.size();
    }


//GETTERS AND SETTTERS
//    public long getId() {
//        return id;
//    }

    public void setId(long id) {
        this.id = id;
    }

//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
}

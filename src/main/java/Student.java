import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;
//    id should be a long number used to represent a "unique user" in our application.
//    name is a String that holds the name of the student.
//    grades is an ArrayList that contains a list of Integer numbers.

//    The Student class should have a constructor that sets both the name and id property,
//        it initializes the grades property as an empty ArrayList.

    // returns the student's id
    public long getId() {
        return this.id;
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    public Student (String studentName, long studentId) {
        this.name = studentName;
        this.id = studentId;
        this.grades = new ArrayList<>();
    }

// adds the given grade to the grades list
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for(int i = 0; i < grades.size(); i++)
            sum += grades.get(i);
        return sum/grades.size();
    }


}

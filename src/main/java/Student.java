public class Student {

    private long id;
    private String name;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

   public long getId(){
        return this.id;
   }

    public Object getName() {
        return this.name;
    }
}

public class Person {
    private String name;
    private boolean isCool;

    public Person(String name, boolean isCool) {
        this.name = name;
        this.isCool = isCool;
    }

    public Person(boolean isCool) {
        this.isCool = isCool;
    }

    public boolean isCool() {
        return isCool;
    }

    public void setCool(boolean cool) {
        isCool = cool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

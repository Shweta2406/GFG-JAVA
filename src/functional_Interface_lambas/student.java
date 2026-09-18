package functional_Interface_lambas;

public class student {
    String name;
    int roll_no;

    public student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "student{name='" + name + "', roll_no=" + roll_no + "}";
    }
}

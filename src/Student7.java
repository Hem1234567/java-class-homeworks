public class Student7 {
    private String name;
    private int id;
    private double fee;

    static int count = 1;

    public void printDetails() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(fee);
    }

    public Student7(String name, int id, double fee) {
        this();                 // calls default constructor
        this.name = name;
        this.id = id;
        this.fee = fee;
    }

    public Student7() {
        System.out.println("Student object - " + count++);
    }
}

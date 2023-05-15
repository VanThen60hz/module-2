package demo_student_mvc.model;

public class Teacher extends Person{
    private double salary;

    public Teacher() {
    }

    public Teacher(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s\n",this.getId(),this.getName(),this.getSalary());

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                "salary=" + salary;
    }
}

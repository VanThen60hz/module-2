package Thi.model;

public class Student extends Person{
    private String classCode;

    public Student() {
    }

    public Student(int id, String name, String birthDay, String gender, String phone, String classCode) {
        super(id, name, birthDay, gender, phone);
        this.classCode = classCode;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s\n",this.getId(),this.getName(),this.getBirthDay(),this.getGender(),this.getPhone(),this.getId());
    }

    public  String getBatchs(){
        return String.format("%s,%s,%s\n",this.getId(),this.getClassCode(),this.getId());
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "classCode='" + classCode + '\'' +
                '}';
    }
}

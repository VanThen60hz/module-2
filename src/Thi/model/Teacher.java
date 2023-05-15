package Thi.model;

public class Teacher extends Person{

    public Teacher(int i, String s, String s1, String s2, String s3, String s4) {
    }

    public Teacher(int id, String name, String birthDay, String gender, String phone) {
        super(id, name, birthDay, gender, phone);
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s\n",this.getId(),this.getName(),this.getBirthDay(),this.getGender(),this.getPhone(),this.getId());
    }

    @Override
    public String toString() {
        return "Teacher {" + super.toString() +
                '}';
    }
}

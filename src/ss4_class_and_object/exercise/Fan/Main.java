package ss4_class_and_object.exercise.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST,true,10,"yellow");
        Fan fan2 = new Fan(Fan.MEDDIUM,false,5,"blue");

        System.out.println("Fan 1: " + fan1);
        System.out.println("Fan 2: "+ fan2);
    }
}

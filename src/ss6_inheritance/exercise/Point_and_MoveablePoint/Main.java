package ss6_inheritance.exercise.Point_and_MoveablePoint;

public class Main {
    public static void main(String[] args) {
        MovablePoint a = new MovablePoint();
        a.setSpeed(4,5);
        a.move();
        System.out.println(a.toString());

    }
}

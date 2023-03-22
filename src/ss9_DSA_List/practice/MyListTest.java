package ss9_DSA_List.practice;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();
        list.add(1);
        list.add(2);
        System.out.println("List: " +list.toString());

        list.get(-1);
        System.out.println("element -1: " + list.get(-1));
    }



}

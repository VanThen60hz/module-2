package ss9_DSA_List.exercise;

public class MyLinkedListest {
    public static void main(String[] args) {

        MyLinkedList<String> list = new MyLinkedList<>("A");
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");
        list.addLast("E");


        System.out.println("Danh sach ban dau:");
        list.printList();


        list.addFirst("Z");
        System.out.println("\nDanh sach sau khi them mot phan tu o vi tri dau tien:");
        list.printList();


        list.remove(2);
        System.out.println("\nDanh sach sau khi xoa mot phan tu o vi tri thu 3:");
        list.printList();


        System.out.println("\nCo ton tai phan tu C trong danh sach khong? " + list.contains("C"));


        System.out.println("Phan tu dau tien cua danh sach: " + list.getFirst());
        System.out.println("Phan tu cuoi cung cua danh sach: " + list.getLast());

        list.clean();
        System.out.println("Kich thuoc danh sach sau khi xoa toan bo noi dung: " + list.size());
    }

}

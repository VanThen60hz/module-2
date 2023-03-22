package ss9_DSA_List.exercise;

public class MyLinkedList<E> {

    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {

        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    // add vào giữa danh sách
    public void add(int index, E element){
        Node temp = head;
        Node holder;

        for (int i = 0; i < index -1 && temp.next != null ; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    //add vào đầu danh sách
    public void addFirst(E element){
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }
    //thêm vào cuối danh sách
    public void addLast(E element){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    //xoá 1 phần tử trong danh sách
    public E remove(int index){
        if(index < 0 || index >=numNodes){
            throw  new IndexOutOfBoundsException("Index: "+index);
        }
        Node temp = head;
        if (index==0){
            head = head.next;
            numNodes--;
            return (E) temp.getData();
        }else{
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            Node removeNode = temp.next;
            temp.next = temp.next.next;
            numNodes--;
            return (E) removeNode.getData();
        }
    }

    //xoá 1 phần tử trong danh sách
    public boolean remove(Object e){
        Node temp = head;
        if (e == null) {
            for (int i = 0; temp.next != null; i++) {
                if (temp.next.data == null) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
        } else {
            for (int i = 0; temp.next != null; i++) {
                if (e.equals(temp.next.data)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    // trả về kích cỡ của danh sách
    public int size(){
        return numNodes;
    }

    // tạo một bản sao của danh sách
    public MyLinkedList<E> clone() {
        if (numNodes == 0) {
            throw new NullPointerException("LinkedList is empty");
        }
        MyLinkedList<E> cloneList = new MyLinkedList<>(head.getData());
        Node temp = head.next;
        while (temp != null) {
            cloneList.addLast((E) temp.getData());
            temp = temp.next;
        }
        return cloneList;
    }

    // kiểm tra sự tồn tại của phần tử trong danh sách
    public boolean contains(E o){
        Node temp = head;
        while (temp != null) {
            if (o.equals(temp.getData())) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // trả về vị trí của phần tử trong danh sách
    public int indexOf(E o){
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (o.equals(temp.getData())) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    // làm cho list có thể chứa tối thiểu minCapacity phần tử
    public void ensureCapacity(int minCapacity){
        if (numNodes < minCapacity) {
            addLast(null);
            ensureCapacity(minCapacity);
        }
    }

    // lấy phần tử đầu tiên của danh sách
    public E getFirst(){
        if (head == null) {
            return null;
        }
        return (E) head.data;
    }

    //Lấy phần tử cuối của danh sách
    public E getLast(){
        if (head == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.data;
    }
    // Xoá toàn bộ nội dung của danh sách
    public  void clean(){
        head = null;
        numNodes = 0;
    }
    //lấy phần tử ở vị trí index cụ thể
    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

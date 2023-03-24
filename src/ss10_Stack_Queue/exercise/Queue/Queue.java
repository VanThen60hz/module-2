package ss10_Stack_Queue.exercise.Queue;




// Tạo một lớp CircularLinkedList để quản lý các node trong Queue
public class Queue {
    private Node head = null; // node đầu tiên trong Queue
    private Node tail = null; // node cuối cùng trong Queue

    // Phương thức để chèn một phần tử vào Queue
    public void enQueue(int value) {
        Node newNode = new Node(value); // tạo node mới với giá trị cho trước
        if (head == null) { // nếu Queue rỗng
            head = newNode; // gán node mới làm head và tail
            tail = newNode;
        } else { // nếu Queue không rỗng
            tail.nextNode = newNode; // gán con trỏ của tail đến node mới
            tail = newNode; // gán node mới làm tail mới
        }
        tail.nextNode = head; // gán con trỏ của tail đến head để tạo thành vòng tròn
    }

    // Phương thức để lấy ra một phần tử từ Queue
    public int deQueue() {
        if (head == null) { // nếu Queue rỗng
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value; // biến để lưu giá trị của phần tử được lấy ra
        if (head == tail) { // nếu chỉ có một phần tử trong Queue
            value = head.value; // lấy giá trị của head
            head = null; // gán head và tail bằng null
            tail = null;
        } else { // nếu có nhiều hơn một phần tử trong Queue
            Node temp = head;  // tạo một biến tạm để lưu node head hiện tại
            value = temp.value;  // lấy giá trị của temp
            head = head.nextNode;  // di chuyển head sang node tiếp theo
            tail.nextNode = head;  // gán con trỏ của tail đến node head mới
            temp.nextNode = null; 
        }
        return value;
    }

    public void displayQueue() {
        if(head == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Elements in Circular Queue are: ");
        Node temp = head;
        while(temp.nextNode != head) {
            System.out.print(temp.value + " ");
            temp = temp.nextNode;
        }
        System.out.print(temp.value);
    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.displayQueue();
        System.out.println("\nDeleted element: "+queue.deQueue());
        System.out.println("Deleted element: "+queue.deQueue());
        queue.displayQueue();
    }
}


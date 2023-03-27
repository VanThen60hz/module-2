package ss10_DSA_List.exercise;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (size == elements.length) {
            // Tăng kích thước danh sách lên gấp đôi
            int newCapacity = elements.length * 2;
            Object[] newElements = new Object[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }

        // Dời các phần tử từ vị trí index đến cuối danh sách sang phải một vị trí
        System.arraycopy(elements, index, elements, index + 1, size - index);

        // Chèn phần tử mới vào vị trí index
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        // Lấy phần tử tại vị trí index
        E removedElement = (E) elements[index];

        // Dời các phần tử từ vị trí index + 1 đến cuối danh sách sang trái một vị trí
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);

        // Gán phần tử cuối cùng của danh sách bằng null để giải phóng bộ nhớ
        elements[size - 1] = null;
        size--;

        return removedElement;
    }


}

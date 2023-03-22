package ss9_DSA_List.exercise;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;  // mảng chứa các phần tử của danh sách
    private static final int DEFAULT_CAPACITY = 10; // dung lượng mặc định của danh sách
    private Object element[];  // số lượng phần tử hiện tại của danh sách

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public MyArrayList(int capacity) {
        if(capacity < 0){
            throw  new IllegalArgumentException("Invalid Capacity: "+capacity);
        }
        this.element = new Object[capacity];
    }

    private void ensureCapacity(int minCapacity){
        int oldCapacity = element.length;
        if(minCapacity > oldCapacity){
            int newCapacity = (oldCapacity *3)/2+1;
            if(newCapacity < minCapacity)
                newCapacity = minCapacity;
            element = Arrays.copyOf(element, newCapacity);
        }
    }
    public boolean add(E e){
        ensureCapacity(size +1);
        element[size++] = e ;
        return true;
    }

    public void add(int index, E element){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity(size+1);
        System.arraycopy(this.element, index, this.element, index + 1,
                size - index);
        this.element[index] = element;
        size++;
    }
    public E remove(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E removedElement = (E) element[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(element, index + 1, element, index,
                    numMoved);
        }
        element[--size] = null;
        return removedElement;
    }
    public int size (){
        return this.size;
    }
    public MyArrayList<E> clone(){
        try {
            MyArrayList<E> copy = (MyArrayList<E>) super.clone();
            copy.element = Arrays.copyOf(element, size);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }
    public boolean contains (E o){
        return indexOf(o) >= 0;
    }
    public int indexOf(E o){
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (element[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(element[i]))
                    return i;
        }
        return -1;
    }
    public E get(int i){
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) element[i];
    }
    public void clear(){
        for (int i = 0; i < size; i++) {
            element[i] = null;
        }
        size = 0;
    }
}
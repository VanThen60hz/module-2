package ss9_DSA_List.practice;

import java.util.Arrays;
import java.util.Scanner;

public class MyList<E> {
    private int size = 0;
    private int DEFAULTY_CAPACITY = 10;
    private Object elements[];
    Scanner sc = new Scanner(System.in);


    public MyList(){
        elements = new Object[DEFAULTY_CAPACITY];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", DEFAULTY_CAPACITY=" + DEFAULTY_CAPACITY +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

    public void add(E e){
        if(size == elements.length){
            elements = Arrays.copyOf(elements,size++);
        }
        elements[size++] = e;
    }

    public void ensureCapa(){
        int newSize;
        do {
            System.out.println("Nhập kích thước mới: ");
            newSize = sc.nextInt();
            if(newSize<size){
                System.out.println("Kích thước ko hợp lệ");
            }
        }while(newSize < size);
        elements = Arrays.copyOf(elements,newSize);
    }

    public E get(int i){
        if(i>=size || i<0){
            throw new IndexOutOfBoundsException("Index: "+ i +" while Size " + size);
        }
        return (E) elements[i];
    }
}

package self_practice.heap;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyHeap {
    int[] items;
    int size;

    public MyHeap(int capacity) {
        this.items = new int[capacity];
        this.size=0;
    }
    public int peek(){
        if (size==0) throw new NoSuchElementException();
        return items[0];//return the root value
    }

    public void insert(int value){
        if (size==items.length) throw new IllegalStateException();
        else {
            items[size++]=value;
            bubbleUp();
        }
    }

    public void bubbleUp(){
        //calculate start point/index
        int index=size-1;
        //while index >0 && parent is less than child contunue...
        //1. swap child and parent
        //calculate next index=parent index
        while (index>0 && items[index]>items[parentIndex(index)]){
            //swap
            swap(index, parentIndex(index));
            //assign index with the parent index
            index=parentIndex(index);
        }
    }

    public int parentIndex(int index){
        return (index-1)/2;
    }

    public void swap(int first, int second) {
        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }
    public void printHeap(){
        for (int i = 0; i < size; i++) {
            System.out.print(items[i]+", ");
        }
        System.out.println();
    }

    public int length(){
        return items.length;
    }

    @Override
    public String toString() {
        return "MyHeap{" +
                "items=" + Arrays.toString(items) +
                ", size=" + size +
                '}';
    }
}

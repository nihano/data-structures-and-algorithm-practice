package self_practice.queue;

import java.util.NoSuchElementException;

public class MyQueue<T> {
    QNode<T> front;//head
    QNode<T> back; //tail
    int size;

    boolean isEmpty() {
       return front == null;
    }

    T peek(){
        return (T)front.value;
    }
    void enqueue(T item){
        QNode<T> qNode = new QNode<>(item);
        if (isEmpty()) front=back=qNode;
        else{
            back.next=qNode;
            back=qNode;
        }
        size++;
    }

    T dequeue(){
        QNode frontNode;// we need to return a value so that we will store the front item in this
        if (isEmpty()) throw new NoSuchElementException();
        if (front==back){
            frontNode=front;
            front=back=null;
        }else {
            frontNode=front;
            front=front.next;
        }
        size--;
        return (T)frontNode.value;
    }
    int size(){
        return size;
    }

}

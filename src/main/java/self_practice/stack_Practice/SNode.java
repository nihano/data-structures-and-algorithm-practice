package self_practice.stack_Practice;

public class SNode<T> {
    public T value;
    SNode<T> next;

    public SNode(T value) {
        this.value = value;
    }
}

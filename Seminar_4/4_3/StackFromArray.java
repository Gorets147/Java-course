import java.sql.Array;

public class StackFromArray {
    //    Реализовать стэк с помощью массива.
    //    Нужно реализовать методы:
    //    size(), empty(), push(), peek(), pop().

    static int[] arrStack;
    static int capacity;
    static int topIndex;

    public static void main(String[] args) {
        capacity = 5;
        arrStack = new int[capacity];
        topIndex = -1;

//        System.out.println(size());
//        System.out.println(empty());
//        push(4);
//        push(6);
//        push(10);
//        System.out.println(size());
//        push(9);
//        System.out.println(pop());
//        System.out.println(size());
//        System.out.println(empty());
//        System.out.println(peek());
    }

    public static int size() {
        return topIndex + 1;
    }

    public static boolean empty() {
        return topIndex == -1;
    }

    public static void push(int element) {
        arrStack[++topIndex] = element;
    }

    public static int peek() {
        return arrStack[topIndex];
    }

    public static int pop() {
        return arrStack[topIndex--];
    }
}

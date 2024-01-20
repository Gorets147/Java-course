import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArrayInStack {
    public static void main(String[] args) {
//       1) Написать метод, который принимает массив элементов, помещает их в стэк
//       и выводит на консоль содержимое стэка.
//       2) Написать метод, который принимает массив элементов, помещает их в
//       очередь и выводит на консоль содержимое очереди.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stack<Integer> stk = getStack(arr);
        Queue<Integer> queue = getQueue(arr);
        while (stk.size()>0){
            System.out.print(stk.pop() + " ");
        }
        System.out.println(queue);
    }

    public static Stack<Integer> getStack(int[] array) {
        Stack<Integer> res = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            res.push(array[i]);
        }
        return res;
    }

    public static Queue<Integer> getQueue(int[] array) {
        Queue<Integer> res = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            res.add(array[i]);
        }
        return res;
    }
}

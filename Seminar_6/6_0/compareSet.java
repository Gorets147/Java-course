import java.util.*;

public class compareSet {
    public static void main(String[] args) {
//        1. Создайте HashSet, заполните его следующими числами: {3, 6, 43, 8, 11, 7, 33, 3, 4, 8}.
//        Распечатайте содержимое данного множества.
//        2. Создайте LinkedHashSet, заполните его следующими числами: {3, 6, 43, 8, 11, 7, 33, 3, 4, 8}.
//        Распечатайте содержимое данного множества.
//        3. Создайте TreeSet, заполните его следующими числами: {3, 6, 43, 8, 11, 7, 33, 3, 4, 8}.
//        Распечатайте содержимое данного множества.
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));
//        hashSet.add(3);
        System.out.println(hashSet);

        Set<Integer> linkedhashSet = new LinkedHashSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));
//        hashSet.add(3);
        System.out.println(linkedhashSet);


        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));
//        hashSet.add(3);
        System.out.println(treeSet);

    }
}

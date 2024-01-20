import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortListPrintList {
    public static void main(String[] args) {
        int length = 10;

        GetRandom(length);
    }

    private static List<Integer> GetRandom(int length) {
        List<Integer> list= new ArrayList<>();


        Random random = new Random();

        for (int i = 0; i < length; i++) {
            list.add(random.nextInt());
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        return list;
    }
}

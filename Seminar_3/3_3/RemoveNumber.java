import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveNumber {
    public static void main(String[] args) {
        //📌 Создать список типа ArrayList<String>.
        //📌 Поместить в него как строки, так и целые числа.
        //📌 Пройти по списку, найти и удалить целые числа.
        List<String> list = new ArrayList<>(Arrays.asList("dasd", "4", "2", "dsad", "23"));
        deleatInteger(list);
        System.out.println(list);

    }

    private static void deleatInteger(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String temp = iterator.next();
            if (IsInt(temp)) {
                iterator.remove();
            }
        }
    }

    public static boolean IsInt(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

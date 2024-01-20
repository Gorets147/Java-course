import java.util.LinkedList;
import java.util.Scanner;

public class Print_num {
    public static void main(String[] args) {
//        Реализовать консольное приложение, которое:
//        1. Принимает от пользователя строку вида
//        text~num
//        2. Нужно рассплитить строку по ~, сохранить text в связный список на
//        позицию num.
//        3. Если введено print~num, выводит строку из позиции num в связном
//        списке и удаляет её из списка.
        Scanner scan = new Scanner(System.in);
        LinkedList<String> linkedlist = new LinkedList<>();
        while (true) {
            System.out.println("Введите строку вида text~num для добавления элемента в список");
            System.out.println("print~num для вывода и удаления элемента");
            System.out.println("для завершения программы введите end");
            String str = scan.nextLine();
            if (str.equals("end")) break;
            String[] strSplit = str.split("~");
            String text = strSplit[0];
            int num = Integer.parseInt(strSplit[1]);

            if (text.equals("print")) {
                if (num >= 0 && num < linkedlist.size()){
                    System.out.println(linkedlist.get(num));
                    linkedlist.remove(num);
                }
                System.out.println(linkedlist);
            } else {
                if (num >= 0 && num <= linkedlist.size()){
                    linkedlist.add(num, text);
                } else {
                    System.err.println("Не корректный ввод, вы можете ввести: " + linkedlist.size());
                }

                System.out.println(linkedlist);
            }

        }
        scan.close();
    }
}

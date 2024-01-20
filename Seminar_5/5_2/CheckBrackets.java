import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
//        Написать программу, определяющую правильность
//        расстановки скобок в выражении.

//        Пример 1: a+(d*3) - истина
//        Пример 2: [a+(1*3) - ложь
//        Пример 3: [6+(3*3)] - истина
//        Пример 4: {a}[+]{(d*3)} - истина
//        Пример 5: <{a}+{(d*3)}> - истина
//        Пример 6: {a+]}{(d*3)} - ложь
        String[] str = { "a+(d*3)", "[a+(1*3)", "[6+(3*3)]", "{a}[+]{(d*3)}", "<{a}+{(d*3)}>", "{a+]}{(d*3)}"};
        for (String item : str) {
            boolean res = checkBrackets(item);
            System.out.println(item + " --> " + res);
        }

    }

    static Map<Character, Character> getMapBrackets() {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        map.put('>', '<');
        return map;
    }

    static Boolean checkBrackets(String str) {
        Map<Character, Character> map = getMapBrackets();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()){
            if (map.containsValue(c)) stack.push(c);
            else if (map.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != map.get(c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

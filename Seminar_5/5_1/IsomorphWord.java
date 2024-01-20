import java.util.HashMap;
import java.util.Map;

public class IsomorphWord {
    public static void main(String[] args) {
    //Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
    //и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
    //некоторую букву во втором слове, при этом
    //1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
    //порядка следования. (Например, add - egg изоморфны)
    //2. буква может не меняться, а остаться такой же. (Например, note - code)
    //ример 1:
    //Input: s = "foo", t = "bar"
    //Output: false
    //Пример 2:
    //Input: s = "paper", t = "title"
    //Output: true
        System.out.println(isIsomorphic("add", "egg"));

    }

    static Boolean isIsomorphic(String s, String t){
        if(s.length() != t.length())return false;
        if(s.equals(t)) return true;
        Map<Character, Character> words = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(words.containsKey(s.charAt(i)) &&
                    words.get(s.charAt(i)) != t.charAt(i)){
                return false;
            } else {
                words.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}

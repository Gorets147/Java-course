import java.util.HashMap;
import java.util.Map;

public class ArabickInRomeDigit {
    public static void main(String[] args) {
//        Написать метод, который переведет число из
//        римского формата записи в арабский.
//        Например, MMXXIV = 2024
//        'I', 1
//        'V', 5
//        'X', 10
//        'L', 50
//        'C', 100
//        'D', 500
//        'M', 1000
        System.out.println(convertRomanToArabic("MMXXIV"));


    }


    static Map<Character, Integer> getMapRomanArabicNums() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        return map;
    }

    static int convertRomanToArabic(String str){
        Map<Character, Integer> mapRomanToArabic = getMapRomanArabicNums();
        int result = 0;
        int prevNum = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            int curNum = mapRomanToArabic.get(str.charAt(i));
            if (curNum < prevNum) result -= curNum;
            else result += curNum;
            prevNum = curNum;
        }
        return result;
    }
}

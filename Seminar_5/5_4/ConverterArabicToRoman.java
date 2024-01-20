import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ConverterArabicToRoman {
    public static void main(String[] args) {
        // Нааписать метод, который переведёт данное
        // целое число в римский формат.
        // 1000, "M"
        // 900, "CM"
        // 500, "D"
        // 400, "CD"
        // 100, "C"
        // 90, "XC"
        // 50, "L"
        // 40, "XL"
        // 10, "X"
        // 9, "IX"
        // 5, "V"
        // 4, "IV"
        // 1, "I"
        int number = 2024;
        String res = convertArabicToRoman(number);
        System.out.printf("%d -> %s", number, res);

    }

    static Map<Integer, String> getMapArabicToRoman() {
        Map<Integer, String> numbers = new LinkedHashMap<>();

        numbers.put(1000, "M");
        numbers.put(900, "C");
        numbers.put(500, "D");
        numbers.put(400, "CD");
        numbers.put(100, "C");
        numbers.put(90, "XC");
        numbers.put(50, "L");
        numbers.put(40, "XL");
        numbers.put(10, "X");
        numbers.put(9, "IX");
        numbers.put(5, "V");
        numbers.put(4, "IV");
        numbers.put(1, "I");
        return numbers;
    }

    static String convertArabicToRoman(int number) {
        if(number > 3999) return "Not correct number";


        Map<Integer, String> numbers = getMapArabicToRoman();
        StringBuilder res = new StringBuilder();


        for (int key : numbers.keySet()){
            while (number >= key){
                res.append(numbers.get(key));
                number -= key;
            }
        }
        return res.toString();

    }


}

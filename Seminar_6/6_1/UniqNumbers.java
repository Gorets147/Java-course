import java.sql.Array;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//1. Напишите метод, который заполнит массив из 1000 элементов случайными
//цифрами от 0 до 500
//        2. Создайте метод, в который передайте заполненный выше массив и с
//помощью Set вычислите процент уникальных значений в данном массиве и
//верните его в виде числа с плавающей запятой.
//Для вычисления процента используйте формулу:
//процент уникальных чисел = количество уникальных чисел * 100 / общее
//количество чисел в массиве.
public class UniqNumbers {
    public static void main(String[] args) {
        int arrayLength = 1000;
        int maxValue = 1000;


        int[] array = CreateRandomArray(arrayLength, maxValue);
        System.out.println(FindUniqPercent(array));
    }

    private static int[] CreateRandomArray(int arrayLength, int maxValue) {
        Random random = new Random();
        int[] arr = new int[arrayLength];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = random.nextInt(maxValue);
        }
        return arr;
    }


    private static double FindUniqPercent(int[] array) {
        Set<Integer> uniqElements = new HashSet<>();
        for (int element : array) {
            uniqElements.add(element);
        }
        return (double) uniqElements.size() * 100 / array.length;
    }
}

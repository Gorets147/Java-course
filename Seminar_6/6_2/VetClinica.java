import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
//использовать не все придуманные поля и методы. Создайте несколько
//экземпляров этого класса, выведите их в консоль.
//        2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
//        его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
public class VetClinica {
    public static void main(String[] args) {
        Cat vaska = new Cat("Peter", "Vaska", "Red", "Dvorterier", 2, 7);
        Cat vaska2 = new Cat("Peter", "Vaska", "Red", "Dvorterier", 2, 4);
        Cat murka = new Cat("Ivan", "Murka", "Grey", "Siam", 3,3);
        Cat murka2 = new Cat("Ivan", "Murka", "Grey", "Siam", 3,5);
        Cat murka3 = new Cat("Ivan", "Murka", "Grey", "Siam", 3,6);
        Cat barsik = new Cat("Aleksey", "Barsik", "Brown", "Siberian", 1,2);

        Set<Cat> cats = new HashSet<>(Arrays.asList(vaska, vaska2, murka, murka2, murka3, barsik));

        for (Cat cat : cats){
            System.out.println(cat);
        }
    }
}

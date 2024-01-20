import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogBook {
    public static void main(String[] args) {
        //Каталог товаров книжного магазина сохранен в виде двумерного
        //списка List<ArrayList<String>> так, что на 0й позиции каждого
        //внутреннего списка содержится название жанра, а на остальных
        //позициях - названия книг. Напишите метод для заполнения данной
        //структуры.

        List<ArrayList<String>> bookshelf = new ArrayList<>();
        ArrayList<String> genre1 = new ArrayList<>(Arrays.asList("genre1", "book1", "book2", "book3"));
        ArrayList<String> genre2 = new ArrayList<>(Arrays.asList("genre2", "book1", "book2", "book3"));
        ArrayList<String> genre3 = new ArrayList<>(Arrays.asList("genre3", "book1", "book2", "book3"));
        ArrayList<String> genre4 = new ArrayList<>(Arrays.asList("genre4", "book1", "book2", "book3"));

        bookshelf.add(genre1);
        bookshelf.add(genre2);
        bookshelf.add(genre3);
        bookshelf.add(genre4);

        for (ArrayList<String> element : bookshelf){
            System.out.println(element);
        }
    }
}

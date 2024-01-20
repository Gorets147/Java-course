/**
 * plusiki
 */
public class plusiki {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }

        long finish = System.currentTimeMillis();
        long elapsed = finish - start;

        System.out.println("Время выполнения: " + elapsed + " ms");
    }
}
package lesson2;

public class Cycles {
    public static void main(String[] args) {
        // напечатаем все числа от 0 до 100
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // сделаем то же самое с помощью while
        int i = 0;
        while (i <= 100) {
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println();
        // и с помощью do - while
        i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 100);
    }
}

package lesson2;

public class SimpleArrays {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4};
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int [] b = new int[5];
        for(int i = 0; i < b.length; i++) {
            b[i] = i;
            System.out.print(b[i] + " ");
        }
        System.out.println();

        String [] strings = {"abc", "adf", "sdfasf", "asfddf"};
        System.out.println(strings[1] + " " + strings[1].length());

        for(String s : strings) {
            System.out.println(s);
        }
    }
}

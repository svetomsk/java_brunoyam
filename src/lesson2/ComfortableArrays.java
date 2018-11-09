package lesson2;

import java.util.Arrays;
import java.util.Random;

public class ComfortableArrays {
    public static void main(String[] args) {
        int [] a = new int[10];
        Random r = new Random();
        for(int i = 0; i < a.length; i++) {
            a[i] = r.nextInt() % 100;
        }
        for(Integer i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(a);
        for(Integer i : a) {
            System.out.print(i + " " );
        }
        System.out.println();
        System.out.println("min = " + a[0]);
        System.out.println("max = " + a[a.length - 1]);
    }
}

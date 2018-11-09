package lesson1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class EchoProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);
        int [] a = new int[1];
        int [] b = a.clone();
    }
}

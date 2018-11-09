package lesson1;

import java.util.*;

public class Casts {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = Integer.toString(a);
		s = s + "!";
		System.out.println(s);


		String number = sc.nextLine();
		int b = Integer.valueOf(number);
		b = b + 1;
		System.out.println(b);

	}
}
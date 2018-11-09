package lesson1;

public class PrimitiveOperations {
    public static void main(String[] args) {
        int a = 125;
        int b = 25;

        int sum = a + b;
        int sub  = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        float c = 123;
        float d = 12.2f;
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c % d);
    }
}

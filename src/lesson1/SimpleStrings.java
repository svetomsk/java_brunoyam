package lesson1;

public class SimpleStrings {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = " world!";


        // есть два способа объединить две строки в одну
        String helloWorld = hello + world;
        String anotherHelloWorld = hello.concat(world);

        System.out.println(helloWorld);
        System.out.println(anotherHelloWorld);

        // у каждой строки мы можем узнать ее длину
        System.out.println(hello.length());
        System.out.println(world.length());
        System.out.println(helloWorld.length());

        // печатаем подстроку с 1 по 3 символ невключительно [1, 3)
        System.out.println(helloWorld.substring(1, 3)); 

        // печатаем символ на первой позиции
        // ВАЖНО: позиции нумеруются с нуля
        System.out.println(world.charAt(1));    
    }
}

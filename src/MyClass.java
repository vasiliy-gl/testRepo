public class MyClass {
    public static void main(String[] args) {
        System.out.println("Hi!");
        new Thread(()-> System.out.println("My first lambda")).start();
    }
}

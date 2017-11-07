public class MyClass {
    public static void main(String[] args) {
        System.out.println("Hi!");
        new Thread(MyClass::myPrint).start();
        Runnable r = ()->MyClass.myPrint();
    }



    static void myPrint(){
        System.out.println("Method reference");
    }
}

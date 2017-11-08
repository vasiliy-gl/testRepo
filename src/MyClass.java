import java.beans.Expression;

public class MyClass {
    Expression expression;

    public static void main(String[] args) {
        System.out.println("Hi!");
        new Thread(MyClass::myPrint).start();
        OneMethod method = MyClass::myPrint;
        Runnable r = method::doIt;
        new Thread(r).start();
    }



    static void myPrint(){
        System.out.println("Method reference");
    }

    @FunctionalInterface
    public interface OneMethod{
        void doIt();
    }
}

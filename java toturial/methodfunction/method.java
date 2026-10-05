package methodfunction;

public class method {
    public static void printjava() {
        System.out.println("java is a programming language");
    }
    public static void printname(String name) {
        System.out.println("Hello, " + name);
    }
    public static void printage(int a , int b) {
        int sum = a + b;
        System.out.println("the sum is " + sum);
    }
    public static void main(String[] args) {
        printjava();
        printname("David");
        printage(10, 20);
        printage(30, 40);
        printage(50, 60);
    }
    
}

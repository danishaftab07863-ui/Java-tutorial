
    import java.util.Scanner;
    public class Input {
    public static void main(String[] args) {
        //how to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");//name from user
        String name = sc.nextLine();
        System.out.println("Enter your age"); //age from user
        int age = sc.nextInt();
        System.out.println("Enter your height"); //height from user
        double height = sc.nextDouble();
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your height is " + height);
}
}
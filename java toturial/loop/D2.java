package loop;

import java.util.Scanner;

public class D2 {
    public static void main(String[] args) {
        //do while loop
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            System.out.print("Here is your number: ");
            System.out.println(num);
        }while(i >= 0);
        System.out.println("THE END");
    }
}

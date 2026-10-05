package exceptionhandling;

public class e {
    public static void main(String[] args) {
        //exception handling
        int [] marks = {100, 90, 80, 70, 60};
        try {
            System.out.println(marks[5]);
        } catch (Exception exception) 
             //do something after catching the exception
        {
            System.out.println("the name is rashid");
        }
    }
}
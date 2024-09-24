import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; 
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
       
        
        System.out.println("Enter the Fibonacci term : ");
        int num = s.nextInt(); 
        
        int result = fibonacci(num); 
        System.out.println("The Fibonacci number at position " + num + " is: " + result); 
        s.close();
    }
}

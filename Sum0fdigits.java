import java.util.Scanner;

public class Sum0fdigits{

    
    public static int SumOfDigits(int number) {
       
        if (number == 0) {
            return 0;
        }
        return (number % 10) + SumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); 
        int result = SumOfDigits(number);
        System.out.println("The sum of digits is: " + result);
        scanner.close();
    }
}


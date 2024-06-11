
import java.util.Scanner;



public class ComputeSum {

    public static void main(String[] args) {

       Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number (0 to quit): ");
        int number = console.nextInt();
        
        do { 
        sum = sum + number;     // moved to top of loop
            System.out.print("Enter a number (0 to quit): ");
            number = console.nextInt();
        }while (number != 0);
        System.out.println("The sum is " + sum);


    }
}

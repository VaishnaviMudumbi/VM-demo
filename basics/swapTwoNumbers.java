package basics;
import java.util.Scanner;
public class swapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); //Input two numbers
        int num2 = sc.nextInt();
        System.out.println("The Numbers before swapping are " + num1 + " and " + num2);
        num2 = num1 + num2;     //Perform swapping without a temporary variable
        num1 = num2 - num1;
        num2 = num2 - num1;
        //Output result
        System.out.println("The Swapped Numbers are " + num1 + " and " + num2);
        sc.close();
    }
}

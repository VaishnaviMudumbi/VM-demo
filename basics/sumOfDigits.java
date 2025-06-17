package basics;
import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//input a number
        int rem;
        int sum = 0;
        while(num != 0){
            rem = num % 10;// rem gives individual digit
            num = num/10;
            sum = sum + rem;// adding all rem to give sum
        }
        //Output result
        System.out.println("The sum of digits is " + sum);
        sc.close();
    }
}

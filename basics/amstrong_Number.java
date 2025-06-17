// Amstrong number is the number whose sum of individual digits raised to the power total number of digits gives the same number
package basics;
import java.util.Scanner;
public class amstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//Input a number
        int og = num;
        int temp = num;
        int dig = 0;
        int rem,sum =0;
        while(num != 0){
            dig ++;
            num = num/10;
        }

        while(temp != 0){
            rem = temp %10;
            sum = sum + (int)Math.pow(rem,dig);//narrowing
            temp = temp/10;
        }
        if(sum == og){
            System.out.println("The given number is a palindrome");//output results
        }
        else{
            System.out.println("The given number is not a palindrome");
        }
        sc.close();
    }
}

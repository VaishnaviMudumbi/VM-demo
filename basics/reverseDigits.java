package basics;
import java.util.Scanner;
public class reverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //Input a number
        int rem;
        StringBuilder rev =  new StringBuilder() ;      
        while(num !=0){
            rem = num%10;
            num = num/10;
            rev.append(rem);  // converting integer rem to a string by concatenation
        }
        //Output result
        System.out.println("The reversed number is " + rev.toString());
        sc.close();
    }
}

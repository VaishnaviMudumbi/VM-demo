package basics;
import java.util.Scanner;
public class countDigits{
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        // Input a number (e.g., 42)
        int num = sc.nextInt();
        int count = 0;      // To store digit count
        if(num == 0){
            count = 1;
        }
        while(num != 0){ 
         num = num/10;      // Remove last digit (e.g., 42 / 10 = 4)
         count++;           // Increase digit count
       }
       //output result
       System.out.println("The number of digits in the given number are " + count);
       sc.close();   
    } 
}
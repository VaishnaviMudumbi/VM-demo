package basics;
import java.util.Scanner;
public class amstrongNumber {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();//Input a number
    int og = num;// storing the number
    int rem;
    int sum = 0;
    while(num != 0){
        rem = num % 10;
        num = num / 10;
        sum = sum + (rem * rem * rem);//cubing individual digits and adding them
    }
    if(sum == og){//comparing values in original and sum 
        System.out.println("The given number is Amstrong Number");
    }
    else{
        System.out.println("The given number is not an Amstrong Number");
    }
    sc.close();
   } 
}

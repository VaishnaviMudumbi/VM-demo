package basics;
import java.util.Scanner;
public class palindromeOrNot {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int original = num;
    int rem;
    String rev = "";
    while(num != 0){
        rem = num%10;
        num = num /10;
        rev = rem + rev;
    }
    System.out.println("The reversd number is " + rev);
    int check = Integer.parseInt(rev);
    if(check == original){
        System.out.println(" The given number is a palindrome");
    }
    else{
        System.out.println(" The given number is not a palindrome");
    }
    sc.close();
  }  
}

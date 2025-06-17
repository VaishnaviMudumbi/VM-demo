//square of a Number N
package basics;
import java.util.*;
class squareOfNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Square of the Number " + N + " is " + N*N);
        sc.close();
    }
}

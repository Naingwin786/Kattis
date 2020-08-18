
import java.util.Scanner;


public class Juding_moose {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1 == 0 && n2 == 0){
            System.out.println("Not a moose");
        }else
        if(n1 > n2){
            System.out.println("Odd "+(n1*2));
        }else
        if(n1 < n2){
            System.out.println("Odd "+(n2*2));
        }else
        if(n1 == n2){
            System.out.println("Even "+(n1*2));
        }
     }
}

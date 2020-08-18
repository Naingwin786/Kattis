
import java.util.Scanner;

public class piceceofcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int v = sc.nextInt();
        if((n/2)>=h){
            h=n-h;
        }
        if((n/2)>=v){
            v=n-v;
        }
        System.out.print(h*v*4);
    }
    
}

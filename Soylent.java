
import java.util.Scanner;


public class Soylent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int x=0;x<t;x++){
            int num=Integer.parseInt(sc.nextLine());
           float ans=(float)num/400;
           
           if(ans>(num/400)){
               System.out.println((num/400)+1);
           }
           else{
               System.out.println(num/400);
           }
        }
    }
}

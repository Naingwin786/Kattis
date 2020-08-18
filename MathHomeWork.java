
import java.util.Scanner;


public class MathHomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int d = sc.nextInt();
        int c = sc.nextInt();
        int l = sc.nextInt();
       boolean ans=false;
        for(int i = 0;(i*b)<=l;i++){
            for(int j = 0;(j*d)<=l;j++){
                for(int k = 0;(k*c)<=l;k++){
                    if((i*b)+(j*d)+(k*c)==l){
                        System.out.println(i+" "+j+" "+k);
                        ans=true;
                    }
                }
            }
        }
        if(ans==false){
            System.out.println("impossible");
        }
    }
}

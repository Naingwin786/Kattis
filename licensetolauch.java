
import java.util.Scanner;
import java.util.StringTokenizer;

public class licensetolauch {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = Integer.parseInt(sc.nextLine());
         String s = sc.nextLine();
         int[] n1 = new int[n];
         StringTokenizer st = new StringTokenizer(s);
         for(int i = 0;i<n;i++){
             n1[i] = Integer.parseInt(st.nextToken());
         }
         int swap = n1[0];
         int res = 0;
         for(int i = 1;i<n;i++){
             if(swap>n1[i]){
                 swap = n1[i];
                 res = i; 
             }
         }
         System.out.print(res);
    }
}

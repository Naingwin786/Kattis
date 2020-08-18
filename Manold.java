
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Manold {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t=Integer.parseInt(sc.nextLine());
            for(int x=1;x<=t;x++){
                int len=Integer.parseInt(sc.nextLine());
                int[] n=new int[len];
                String s=sc.nextLine();
                StringTokenizer st=new StringTokenizer(s);
                for(int i=0;i<n.length;i++){
                    n[i]=Integer.parseInt(st.nextToken());
                }
                Arrays.sort(n);
                if(n[0]==n[1]){
                    System.out.println("Case #"+x+": "+n[len-1]);
                }
                else
                    if(n[len-1]==n[len-2]){
                        System.out.println("Case #"+x+": "+n[0]);
                    }
                
            }
}
}

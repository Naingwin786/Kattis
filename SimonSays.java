
import java.util.Scanner;


public class SimonSays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int x=0;x<t;x++){
            String s=sc.nextLine();
            if(s.substring(0, 10).equals("Simon says")){
                System.out.println(s.substring(11));
            }
        }
        sc.close();
    }
    
}

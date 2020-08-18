
import java.util.Scanner;


public class fiftyshadesofpink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = Integer.parseInt(sc.nextLine());
        int count = 0;
        for(int i = 0;i<l;i++){
            String s = sc.nextLine().toLowerCase();
            for(int j=0;j<s.length()-3;j++){
                if(s.charAt(j) == 'p'&&s.charAt(j+1) == 'i'&&s.charAt(j+2) == 'n'&&s.charAt(j+3) == 'k'){
                    count++;
                    break;
                }
                if(s.charAt(j) == 'r'&&s.charAt(j+1) == 'o'&&s.charAt(j+2) == 's'&&s.charAt(j+3) == 'e'){
                    count++;
                    break;
                }
            }
            
        }
        if(count!=0)
            System.out.print(count);
        else
            System.out.print("I must watch Star Wars with my daughter");
    }
    
}

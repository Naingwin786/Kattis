
import java.util.Scanner;


public class Kemija {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch[] = new char[]{'a','e','i','o','u'};
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) && s.charAt(i+1)=='p' && ch.equals(s.charAt(i+2))){
                i++;
            }
            else{
                System.out.print(s.charAt(i));
            }
        }
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DetailedD {
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int t = Integer.parseInt(br.readLine());
                for(int x = 0;x <t;x++){
                    String s1 = br.readLine();
                    String s2 = br.readLine();
                    if(s1.length()==s2.length() && s1.length()>=1 && s1.length()<=50){
                        System.out.println(s1);
                        System.out.println(s2);
                        for(int i = 0;i <s1.length();i++){
                            if(s1.charAt(i)==s2.charAt(i))
                                System.out.print(".");
                            else
                                System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                br.close();
    }
    
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Symmetric {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int t = Integer.parseInt(br.readLine());
         int count =1;
         while(t!=0){
             if(t<15){
             String[] s=new String[t];
             for(int i = 0;i <s.length;i++){
                 s[i]=br.readLine();
             }
                 System.out.println("SET "+count);
                 int i;
                 for( i =0 ;i <s.length;i+=2){
                     System.out.println(s[i]);
                 }
                 if(s.length%2!=0){
                 for( i = i-3;i >0;i-=2){
                     System.out.println(s[i]);
                 }
                     }
                 else{
                      for( i = i-1;i >0;i-=2){
                     System.out.println(s[i]);
                 }
                 }
                     }
             count++;
             t = Integer.parseInt(br.readLine());
         }
         br.close();
    }
}

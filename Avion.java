
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Avion {
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                Boolean ans = false;
                for(int i = 0;i <5;i++){
                     String s = br.readLine();
                      for(int j = 0;j <s.length()-2;j++){
                          if(s.charAt(j)=='F'){
                              if(s.charAt(j+1)=='B'){
                                  if(s.charAt(j+2)=='I'){
                                      if(i >=1){
                                          System.out.print(" ");
                                      }
                                      ans=true;
                                      System.out.print(i+1);
                                      
                                  }
                              }
                          }
                      } 
                     
                      
                }
                 if(ans==false){
                          System.out.print("HE GOT AWAY!");
                 }
                br.close();
   
}
}

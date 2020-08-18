
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class sevenWonder {
    static int min(int x,int y,int z) 
 { 
     
     if (x <= y && x <= z) return x; 
     if (y <= x && y <= z) return y; 
     else return z; 
 } 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int t = 0,c = 0,g = 0;
        if( s.length()<50 && ){
            for(int i = 0;i <s.length();i++){
               // if(s.charAt(i)=='T' || s.charAt(i)=='C' || s.charAt(i)=='G'){
                if(s.charAt(i)=='T')
                    t++;
                if(s.charAt(i)=='C')
                    c++;
                if(s.charAt(i)=='G')
                    g++;
            }
            //}
            //if(t >0 && c >0 && g >0){
                int ans = (int) (Math.pow(t, 2)+Math.pow(c, 2)+Math.pow(g, 2)+(min(t, c, g)*7));
                System.out.print(ans);
           // }
                /*
            else{
                int ans = (int) (Math.pow(t, 2)+Math.pow(c, 2)+Math.pow(g, 2));
                System.out.print(ans);
            }*/
        }
        br.close();
    }
    
}

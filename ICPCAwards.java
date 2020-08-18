
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;


public class ICPCAwards {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        HashMap<String,String> h = new HashMap<>(12);
        String[] y = new String[12];
        int r=0;
        for(int x = 0;x <t;x++){
            String st = br.readLine();
            StringTokenizer s = new StringTokenizer(st);
            String s1 = s.nextToken();
            String s2 = s.nextToken();
            if(s2 != "WINDOWS" || s2 != "UBUNTU"){
                if(!y.equals(s1)){
                y[r]=s1;
                h.put(y[r], s2);
                r++;
                }
            }
        }
        for(int i = 0;i <h.size();i++){
            System.out.println(y[i]+" "+h.get(y[i]));
        }
        
    }
}

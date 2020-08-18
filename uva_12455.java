
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class uva_12455 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        boolean result;
        for(int x = 0;x < t;x++){
            result = false;
       
            int X = Integer.parseInt(br.readLine());
            int len = Integer.parseInt(br.readLine());
            int[] l = new int[len];
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            for(int i = 0;i < len;i++){
                l[i]=Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < (1 << len); i++) {
                int sum = 0;
                for (int j = 0; j < len; j++)
                    if ((i & (1 << j)) != 0) 
                    sum += l[j];
                    // if yes, process ‘j’
                   if (sum == X || X==0){
                       System.out.println("YES");
                       result = true;
                       break;
                   }
                }
                if (!result) {
                    System.out.println("NO");

            }
        
        }
            br.close();
    }
}

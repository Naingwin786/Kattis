
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class skener {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int zr = Integer.parseInt(st.nextToken());
        int zc = Integer.parseInt(st.nextToken());
        for(int i = 0;i <r;i++){
            String s1 = br.readLine();
            for(int l = 0;l <zr;l++){
            for(int j = 0;j <c;j++){
                for(int k = 0;k <zc;k++){
                    System.out.print(s1.charAt(j));
                }
            }
                System.out.println();
            }
        }
        br.close();
    }
    
}

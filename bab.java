
import java.util.Scanner;
import java.util.StringTokenizer;

public class bab {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			StringTokenizer tt = new StringTokenizer(s," ,");
			long total = 0;
			int power = tt.countTokens()-1;
                                            System.out.println(power);
			while (tt.hasMoreTokens()) {
				int no = 0;
				try {
                                                                    
					no = Integer.parseInt(tt.nextToken().trim());
				} catch (Exception e) {
				}
				total += no * Math.pow(60, power--);
			}
			System.out.println(total);
		}
	}

}

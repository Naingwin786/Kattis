
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class uva_11475 {
    	static int KMPSearch(String pat, String txt) {
		int M = pat.length();
		int N = txt.length();
		int lps[] = new int[M];
		int j = 0;
		int i = 0;

		computeLPSArray(pat, M, lps);

		while (i < N) {
				while (j < M)
				{
					System.out.println("i= "+i+" j= "+j +" M= "+M);
					if (i < N && j < M && txt.charAt(i) == pat.charAt(j)) {
						i++;
						j++;
					} else
						break;
				}
			if (j == 0)
				i++;
			if (i == N)
				return j;
			j = lps[j];
		}
		return 0;
	}

	static void computeLPSArray(String pat, int M, int lps[]) {

		int j = 0;
		int i = 1;
		lps[0] = 0;

		while (i < M) {

			if (pat.charAt(j) == pat.charAt(i)) {
				j++;
				lps[i] = j;
				i++;
			} else if (j == 0) {

				lps[i] = j;
				i++;
			} else {
				j = lps[j-1];
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String a = scan.next(); 			
			System.out.println("a :" + a);
			String b = new StringBuffer(a).reverse().toString();
			System.out.println("b = " + b);
			uva_11475 kmp = new uva_11475();
			int res = kmp.KMPSearch(b, a);
			String c = a.substring(0, a.length() - res);
			System.out.println("c = " + c);
			String d = new StringBuffer(c).reverse().toString();
			System.out.println("d = " + d);
			String ans = a + d;
			System.out.println(ans);
		}
	}

                
                
        }
    



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class longestCommonSubs {
    int lcs(char[] X, char[] Y, int m, int n) {
		int L[][] = new int[m + 1][n + 1];

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					L[i][j] = 0; // fill with 0 first row and first column
				else if (X[i - 1] == Y[j - 1])
					L[i][j] = L[i - 1][j - 1] + 1;
				else
					L[i][j] = max(L[i - 1][j], L[i][j - 1]);
			}
		}
		return L[m][n];
	}

	int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static void main(String[] args) throws IOException {
		longestCommonSubs lcs = new longestCommonSubs();
		//String s1 = "abcd";
		//String s2 = "acdb";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();

		char[] X = s1.toCharArray();
		char[] Y = s2.toCharArray();
		int m = X.length; // 10
		int n = Y.length; // 9

		System.out.println("Length of LCS is" + " " + lcs.lcs(X, Y, m, n));
	}


}

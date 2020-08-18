
public class KMD_String_Matching {
    void KMPSearch(String pat, String txt) {
		int M = pat.length();
		int N = txt.length();

		// create lps[] that will hold the longest prefix suffix values for pattern
		int lps[] = new int[M];
		int j = 0; // index for pat[]

		// Preprocess the pattern (calculate lps[] array)

		computeLPSArray(pat, M, lps);

		int i = 0; // index for txt[]
		while (i < N) {
			if (pat.charAt(j) == txt.charAt(i)) {
				j++;
				i++;
			}
			if (j == M) {
				System.out.println("Found pattern " + "at index " + (i - j));
				j = lps[j - 1];
			}
			else if (i < N && pat.charAt(j) != txt.charAt(i)) {
				if (j != 0)
					j = lps[j - 1];
				else
					i = i + 1;
			}
		}
	}

	void computeLPSArray(String pat, int M, int lps[]) {
		// length of the previous longest prefix suffix
		int j = 0;
		int i = 1;
		lps[0] = 0; // lps[0] is always 0

		// the loop calculates lps[i] for i = 1 to M-1
		while (i < M) {
			//System.out.println("j = " + j + "  " + pat.charAt(j) + "  i = " + i + "  " + pat.charAt(i));
			if (pat.charAt(j) == pat.charAt(i)) {
				j++;
				lps[i] = j;
				i++;
			} else // (pat[i] != pat[j])
			{
				if (j != 0) {
					j = lps[j - 1];

				} else // if (j == 0)
				{
					lps[i] = j;
					i++;
				}
			}
		}
	}
	public static void main(String args[]) {

		String txt = "abcabaabcaby";
		String pat = "abcaby";
		//String txt="actcagatgatgattgaagatgattgctcttac";
		//String pat="gatgat";
		//String txt="A B A B A B D A C D A A B A B C A B A B A B";
		//String pat="A B A B";
		new KMD_String_Matching().KMPSearch(pat, txt);
	}

    
}

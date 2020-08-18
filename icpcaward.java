
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;


public class icpcaward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, String> teams = new LinkedHashMap<>();

        int cases = sc.nextInt();
        sc.nextLine();
        while (cases-- > 0) {
            String st = sc.nextLine();
	String[] str = st.split(" ");
			String place = str[0];
			String name = "";
			for(int j=1;j<str.length;j++)
			{
				name += " " + str[j];
                        }
            if (!teams.containsKey(place) && teams.size()<12)
                teams.put(place, name);
        }
        for (Map.Entry<String, String> s : teams.entrySet())
            System.out.println(s.getKey() + s.getValue());
        sc.close();
    }
}

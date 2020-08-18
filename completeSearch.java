
public class completeSearch {
    public static void main(String[] args) {
        int N = 62;
        for (int fghij = 01234; fghij <= 98765 / N; fghij++) {
            int abcde = fghij * N;
            int tmp;
            if(fghij<10000){
                int used = 0;
            
            tmp = abcde; while (tmp != 0) { used |= 1 << (tmp % 10); tmp /= 10; }
            tmp = fghij; while (tmp != 0) { used |= 1 << (tmp % 10); tmp /= 10; }
            if (used == (1<<10) - 1){
                System.out.println( abcde+ " "+ fghij);
            }
            }
        }
    }
}

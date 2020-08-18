
public class uva_11565 {
    public static void main(String[] args) {
        boolean sol=false;
        int x,y,z;
        int A=4,B=4,C=14;
        for (x = -100; x <= 100; x++){
        for (y = -100; y <= 100; y++){
        for (z = -100; z <= 100; z++){
        if (y != x && z != x && z != y &&  x + y + z == A && x * y * z == B && x * x + y * y + z * z == C) {
         System.out.println( x+ " "+ y+ " "+z);
            sol = true; }
    }
        }
        }

    }
    
}

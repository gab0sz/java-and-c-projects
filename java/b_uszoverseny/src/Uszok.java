import java.util.Arrays;
import java.util.Scanner;

public class Uszok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] uszok = new int[n];
        int i = 0;
        while (sc.hasNextLine()){
            String[] sor = (sc.nextLine()).split(" ");
            for (int j = 0; j < 8; j++){
                uszok[j + (i*8)] = Integer.parseInt(sor[j]);
            }
            i++;
        }
        int[] uszok2 = new int[n];
        for(int k = 0; k < uszok.length; k++){
            if (uszok[k] != 0){
                uszok2[uszok[k]-1] = uszok[k];
            }
        }
        for (int k = 0; k < uszok.length; k++){
            if (uszok2[k] == 0){
                System.out.print(k+1 + " ");
            }
        }
    }
}

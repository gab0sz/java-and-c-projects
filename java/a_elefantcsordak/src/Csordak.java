import java.util.Scanner;

public class Csordak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sor1 = (sc.nextLine()).split(" ");
        String[] sor2 = (sc.nextLine()).split(" ");
        int[] tav = new int[sor1.length];
        int[] ido = new int[sor2.length];
        for (int i = 0; i < sor1.length; i++){
            tav[i] = Integer.parseInt(sor1[i]);
            ido[i] = Integer.parseInt(sor2[i]);
        }
        double[] seb = new double[sor1.length];
        double max = 0;
        for (int i = 0; i < seb.length; i++){
            seb[i] = tav[i] / ido[i];
            if (max < seb[i]){
                max = seb[i];
            }
        }
        for (int i = 0; i < seb.length; i++){
            if (seb[i] == max){
                System.out.println(i+1);
            }
        }
    }

}

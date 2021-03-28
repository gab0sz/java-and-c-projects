import java.util.Arrays;
import java.util.Scanner;

public class Permutaciok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()){
            String sor = sc.nextLine();
            if (sor.equals("")){
                System.out.println("YES");
            }else {
                String[] tomb = sor.split(" ");

                int[] szamok = new int[tomb.length];
                for (int i = 0; i < tomb.length; i++) {
                    szamok[i] = Integer.parseInt(tomb[i]);
                }
                Arrays.sort(szamok);
                for (int i = 1; i <= szamok.length; i++) {
                    if (i != szamok[i - 1]) {
                        System.out.println("NO");
                        break;
                    }
                    if (i == szamok.length && i == szamok[i - 1]) {
                        System.out.println("YES");
                    }
                }
            }
        }
    }
}

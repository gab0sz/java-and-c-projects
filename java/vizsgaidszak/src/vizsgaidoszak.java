import java.util.Arrays;
import java.util.Scanner;

public class vizsgaidoszak {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String sor = read.nextLine();
        String[] sor1 = sor.split(" ");
        int n = sor1.length;
        int[] tomb = new int[n];
        for (int i = 0; i < sor1.length; i++) {
            tomb[i] = Integer.parseInt(sor1[i]);
        }
        String sor2 = read.nextLine();
        String[] sor22 = sor2.split(" ");
        int k = sor22.length;
        int[] tomb2 = new int[k];
        for (int i = 0; i < k; i++) {
            tomb2[i] = Integer.parseInt(sor22[i]);
        }
        int l = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if (tomb[i] == tomb2[j])
                    l++;
            }
        }
        System.out.println(l);
    }
}
//https://progcont.hu/progcont/100278/?pid=201287
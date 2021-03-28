import java.util.Scanner;


public class tankolas {

    public static class megallok
    {
        int megtettut, tankolas;
        public megallok (int megtettut, int tankolas)
        {
            this.megtettut = megtettut;
            this.tankolas = tankolas;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int K, L, N, F;
        String[] sor1 = s.nextLine().split(" ");
        K = Integer.parseInt(sor1[0]);
        L = Integer.parseInt(sor1[1]);
        N = Integer.parseInt(sor1[2]);
        F = Integer.parseInt(sor1[3]);
        int kezdoL = L;
        megallok[] tomb = new megallok[N];
        int idk = 0;
        String sor;
        int max = 0;

            for (int i = 0; i < N; i++) {
                sor = s.nextLine();
                String[] sor2 = sor.split(" ");
                tomb[i] = new megallok(Integer.parseInt(sor2[0]), Integer.parseInt(sor2[1]));

                if (L - (tomb[i].megtettut - idk) * F + tomb[i].tankolas > max) {
                    max = L - (tomb[i].megtettut- idk)* F + tomb[i].tankolas;
                }
                L = max;
                idk = tomb[i].megtettut;

            }
        if (max < kezdoL)
        {
            max = kezdoL;
        }

        System.out.println(max);
    }


}
//https://progcont.hu/progcont/100278/?pid=201286
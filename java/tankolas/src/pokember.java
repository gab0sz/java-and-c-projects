import java.util.Scanner;

public class pokember {

    public static class hazak{
        int hazszam, magassag;

        public hazak(int hazszam, int magassag) {
            this.hazszam = hazszam;
            this.magassag = magassag;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k, n, num = 0;
        String[] sor1 = s.nextLine().split(" ");
        n = Integer.parseInt(sor1[0]);
        k = Integer.parseInt(sor1[1]);
        hazak[] tomb = new hazak[n];

        for (int i = 0; i < n; i++){

            String[] sorok = s.nextLine().split(" ");
            tomb[i] = new hazak(Integer.parseInt(sorok[0]), Integer.parseInt(sorok[1]));
            if (tomb[i].magassag > k){
                num++;
            }
        }
        System.out.println(num);
    }
}

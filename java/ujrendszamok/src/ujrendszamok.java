import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ujrendszamok {

    public static class autok{
        String rendszam;
        int evjarat;
        String marka;

        public autok(String rendszam, int evjarat, String marka) {
            this.rendszam = rendszam;
            this.evjarat = evjarat;
            this.marka = marka;
        }
    }


    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        String[] sor;
        autok tomb[] = new autok[n];


        for (int i = 0; i < n; i++){
            sor = sc.nextLine().split(":");
            tomb[i] = new autok(sor[0], Integer.parseInt(sor[1]), sor[2]);
            String[] idk;
            idk = sor[0].split("-");
            String tmp;
            tmp = idk[0];
            idk[0] = idk[1];
            idk[1] = tmp;
           // System.out.println(idk[0] + idk[1]);
            tomb[i].rendszam = idk[0] + "-" + idk[1];

        }
        Arrays.sort(tomb, new comp());
        for (int i = 0; i < n; i++){
            System.out.println(tomb[i].rendszam + " " + tomb[i].marka + " (" + tomb[i].evjarat + ")");
        }
    }
    static class comp implements Comparator<autok>{
        public int compare(autok o1, autok o2){
            return o1.rendszam.compareTo(o2.rendszam);
        }
    }
}

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class gyumolcsle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String sorok;
        gyumolcslevek[] tomb = new gyumolcslevek[n];
        for (int i = 0; i < n; i++) {
            sorok = sc.nextLine();
            String[] sor = sorok.split(";");
            tomb[i] = new gyumolcslevek(sor[0], Integer.parseInt(sor[1]), Integer.parseInt(sor[2]), Integer.parseInt(sor[3]));
        }
        Arrays.sort(tomb, new Mycomparer());

        for (int i = 0; i < n; i++) {
            System.out.println(tomb[i].nev + " (" + tomb[i].ev + "-" + tomb[i].honap + "-" + tomb[i].nap + ")");
            //System.out.println(tomb[i].ev);
           // System.out.println(tomb[i].honap);
        }
    }

    static class gyumolcslevek {
        String nev;
        int ev;
        int honap;
        int nap;

        public gyumolcslevek(String nev, int ev, int honap, int nap) {
            this.nev = nev;
            this.ev = ev;
            this.honap = honap;
            this.nap = nap;
        }
    }

    static class Mycomparer implements Comparator<gyumolcslevek> {
        public int compare(gyumolcslevek o1, gyumolcslevek o2) {
            if (o1.ev == o2.ev) {
                if (o1.honap == o2.honap) {
                    if (o1.nap == o2.nap) {
                        return o1.nev.compareTo(o2.nev);
                    }
                    return o2.nap - o1.nap;
                }
                return o2.honap - o1.honap;
            }
            return o2.ev - o1.ev;
        }
    }

}
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Repuloterek implements Comparable<Repuloterek> {
    String nev;
    String varos;
    int futop;
    int atsz;

    public Repuloterek(String nev, String varos, int futop, int atsz) {
        this.nev = nev;
        this.varos = varos;
        this.futop = futop;
        this.atsz = atsz;
    }

    @Override
    public String toString() {
        return nev + " (" + varos + "): " + atsz;
    }

    @Override
    public int compareTo(Repuloterek o) {
        int c = -Integer.compare(this.futop,o.futop);
        if (c != 0){
            return c;
        }
        c = -Integer.compare(this.atsz,o.atsz);
        if (c != 0){
            return c;
        }
        c = this.nev.compareTo(o.nev);
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Repuloterek[] r = new Repuloterek[n];
        for (int i = 0; i < n; i++){
            String[] sor = sc.nextLine().split(";");
            r[i] = new Repuloterek(sor[0],sor[1],Integer.parseInt(sor[2]),Integer.parseInt(sor[3]));
        }
        Arrays.sort(r);

        for (int i = 0; i < n; i++){
            System.out.println(r[i].toString());
        }
    }
}

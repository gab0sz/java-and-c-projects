import java.util.Arrays;
import java.util.Scanner;

public class Hullamvasutak implements Comparable<Hullamvasutak> {
    String nev;
    String vilag;
    int magassag;
    int varakozas;

    public Hullamvasutak(String nev, String vilag, int magassag, int varakozas) {
        this.nev = nev;
        this.vilag = vilag;
        this.magassag = magassag;
        this.varakozas = varakozas;
    }

    @Override
    public String toString() {
        return nev + " (" + vilag + "): " + varakozas;
    }

    @Override
    public int compareTo(Hullamvasutak o) {
        int ertek = Integer.compare(this.varakozas,o.varakozas);

        if(ertek != 0)
            return ertek;

        ertek = -Integer.compare(this.magassag,o.magassag);

        if(ertek != 0)
            return  ertek;

        return this.nev.compareTo(o.nev);
    }
}

class Test{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Hullamvasutak h[] = new Hullamvasutak[n];

        for (int i = 0; i < n; i++) {
            String tokenek[] = scan.nextLine().split(";");
            h[i] = new Hullamvasutak(tokenek[0], tokenek[1], Integer.parseInt(tokenek[2]), Integer.parseInt(tokenek[3]));
        }

        Arrays.sort(h);

        for(Hullamvasutak elem: h)
        {
            System.out.println(elem.toString());
        }
    }
}
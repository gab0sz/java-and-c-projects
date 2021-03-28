import java.util.Arrays;
import java.util.Scanner;

public class Mozi implements Comparable<Mozi>{
    String cim;
    int ev;
    String rendezo;
    int koltseg;
    int bevetel;

    public Mozi(String cim, int ev, String rendezo, int koltseg, int bevetel) {
        this.cim = cim;
        this.ev = ev;
        this.rendezo = rendezo;
        this.koltseg = koltseg;
        this.bevetel = bevetel;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Mozi[] m = new Mozi[n];
        for (int i = 0; i < n; i++){
            String[] sor = sc.nextLine().split(";");
            m[i] = new Mozi(sor[0], Integer.parseInt(sor[1]),sor[2],Integer.parseInt(sor[3]),Integer.parseInt(sor[4]));

        }
        Arrays.sort(m);
        for(int i = 0; i < n; i++){
            System.out.println(m[i].toString());
        }
    }

    @Override
    public String toString() {
        return cim;
    }

    @Override
    public int compareTo(Mozi o) {
        int c = -Integer.compare(this.bevetel-this.koltseg,o.bevetel-o.koltseg);
        if (c != 0) return c;

        c = Integer.compare(this.ev, o.ev);
        if (c != 0) return c;

        c = -Integer.compare(this.bevetel,o.bevetel);
        if (c != 0) return c;

        c = this.cim.compareTo(o.cim);
        return c;
    }
}

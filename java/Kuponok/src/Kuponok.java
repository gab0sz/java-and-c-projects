import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Kuponok implements Comparable<Kuponok> {
    String uzlet;
    String termek;
    int kedvezmeny;

    public Kuponok(String uzlet, String termek, int kedvezmeny) {
        this.uzlet = uzlet;
        this.termek = termek;
        this.kedvezmeny = kedvezmeny;
    }

    @Override
    public String toString() {
        return termek + " (" + uzlet + "): " + kedvezmeny + "%";
    }

    @Override
    public int compareTo(Kuponok o) {
        int asd = -Integer.compare(this.kedvezmeny,o.kedvezmeny);

        if (asd != 0){
            return asd;
        }
        asd = this.uzlet.compareTo(o.uzlet);
        if (asd != 0){
            return asd;
        }

        return this.termek.compareTo(o.termek);
    }
    static public class SortBy implements Comparator<Kuponok>{

        @Override
        public int compare(Kuponok o1, Kuponok o2) {
            int asd = o1.uzlet.compareTo(o2.uzlet);
            if (asd != 0){
                return asd;
            }
            asd = -Integer.compare(o1.kedvezmeny,o2.kedvezmeny);
            if (asd != 0){
                return asd;
            }

            return o1.termek.compareTo(o2.termek);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Kuponok[] k = new Kuponok[n];
        for (int i = 0; i < n; i++){
            String[] sor = (sc.nextLine()).split(";");
            k[i] = new Kuponok(sor[0],sor[1],Integer.parseInt(sor[2]));
        }

        Arrays.sort(k);

        for(int i = 0; i < n; i++){
            System.out.println(k[i].toString());
        }
        System.out.println();

        Arrays.sort(k, new Kuponok.SortBy());
        for(int i = 0; i < n; i++){
            System.out.println(k[i].toString());
        }
    }
}



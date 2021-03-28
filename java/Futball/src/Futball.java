import java.util.*;

public class Futball implements Comparable<Futball> {
    String csapatnev;
    int pontok;
    int lejatszott_merkozesek;
    int gyozelmek;
    int dontetlenek;
    int veresegek;
    int golkulonbseg;
    int rugott_golok;
    int kapott_golok;

    public Futball(String csapatnev, int pontok, int lejatszott_merkozesek, int gyozelmek, int dontetlenek, int veresegek, int golkulonbseg, int rugott_golok, int kapott_golok) {
        this.csapatnev = csapatnev;
        this.pontok = pontok;
        this.lejatszott_merkozesek = lejatszott_merkozesek;
        this.gyozelmek = gyozelmek;
        this.dontetlenek = dontetlenek;
        this.veresegek = veresegek;
        this.golkulonbseg = golkulonbseg;
        this.rugott_golok = rugott_golok;
        this.kapott_golok = kapott_golok;
    }

    @Override
    public String toString() {
        return csapatnev +" "+ pontok + "p, " + lejatszott_merkozesek + "g " + "(" +
                gyozelmek + "-" + dontetlenek + "-" + veresegek + "), " + golkulonbseg + "gd " +
                        "(" + rugott_golok + "-" + kapott_golok +  ")";
    }
    @Override
    public int compareTo(Futball o) {
        int c = -Integer.compare(this.pontok,o.pontok);
        if (c != 0) return c;

        c = -Integer.compare(this.gyozelmek,o.gyozelmek);
        if (c != 0) return c;

        c = -Integer.compare(this.golkulonbseg, o.golkulonbseg);
        if (c != 0) return c;

        c = -Integer.compare(this.rugott_golok, o.rugott_golok);
        if (c != 0) return c;

        c = Integer.compare(this.lejatszott_merkozesek, o.lejatszott_merkozesek);
        if (c != 0) return c;

        return this.csapatnev.compareTo(o.csapatnev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int k = 0; k < n; k++){
            HashMap<String,Futball> foci = new HashMap<>();
            String bajnoksag_neve = sc.nextLine();
            int t = Integer.parseInt(sc.nextLine());
            Futball[] f = new Futball[t];
            for (int j = 0; j < t; j++){
                String asd = sc.nextLine();
                foci.put(asd,new Futball(asd,0,0,0,0,
                                                0,0,0,0));

            }
            int g = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < g; i++){
                String[] tok = sc.nextLine().split("#|@");
                if (Integer.parseInt(tok[1]) > Integer.parseInt(tok[2])){
                    foci.get(tok[0]).pontok += 3;
                    foci.get(tok[0]).gyozelmek++;
                    foci.get(tok[3]).veresegek++;
                    foci.get(tok[0]).lejatszott_merkozesek++;
                    foci.get(tok[3]).lejatszott_merkozesek++;
                    foci.get(tok[0]).rugott_golok += Integer.parseInt(tok[1]);
                    foci.get(tok[0]).kapott_golok += Integer.parseInt(tok[2]);
                    foci.get(tok[3]).rugott_golok += Integer.parseInt(tok[2]);
                    foci.get(tok[3]).kapott_golok += Integer.parseInt(tok[1]);
                }
                if (Integer.parseInt(tok[1]) < Integer.parseInt(tok[2])){
                    foci.get(tok[3]).pontok += 3;
                    foci.get(tok[3]).gyozelmek++;
                    foci.get(tok[0]).veresegek++;
                    foci.get(tok[3]).lejatszott_merkozesek++;
                    foci.get(tok[0]).lejatszott_merkozesek++;
                    foci.get(tok[0]).rugott_golok += Integer.parseInt(tok[1]);
                    foci.get(tok[0]).kapott_golok += Integer.parseInt(tok[2]);
                    foci.get(tok[3]).rugott_golok += Integer.parseInt(tok[2]);
                    foci.get(tok[3]).kapott_golok += Integer.parseInt(tok[1]);
                }
                if (Integer.parseInt(tok[1]) == Integer.parseInt(tok[2])){
                    foci.get(tok[3]).pontok += 1;
                    foci.get(tok[0]).pontok += 1;
                    foci.get(tok[3]).dontetlenek++;
                    foci.get(tok[0]).dontetlenek++;
                    foci.get(tok[3]).lejatszott_merkozesek++;
                    foci.get(tok[0]).lejatszott_merkozesek++;
                    foci.get(tok[0]).rugott_golok += Integer.parseInt(tok[1]);
                    foci.get(tok[0]).kapott_golok += Integer.parseInt(tok[2]);
                    foci.get(tok[3]).rugott_golok += Integer.parseInt(tok[2]);
                    foci.get(tok[3]).kapott_golok += Integer.parseInt(tok[1]);
                }
            }
            for(Map.Entry<String, Futball> elem: foci.entrySet()){
                elem.getValue().golkulonbseg = elem.getValue().rugott_golok - elem.getValue().kapott_golok;
            }
            int l = 0;
            for(Map.Entry<String, Futball> elem: foci.entrySet()) {
                f[l] = elem.getValue();
                l++;
            }
            Arrays.sort(f);
            System.out.println(bajnoksag_neve);
            for (int i = 0; i < f.length; i++){
                System.out.println((i+1)+") " + f[i].toString());
            }

        }
    }


}

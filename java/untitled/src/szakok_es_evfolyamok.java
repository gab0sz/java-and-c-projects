import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class szakok_es_evfolyamok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor = new String();
        String[] sorok;
        List<hallgatok> lista = new ArrayList<>();
        while (sc.hasNextLine()){
            sorok = sor.split(";");
            lista.add(new hallgatok(Integer.parseInt(sorok[0]), sorok[1], sorok[2]));
        }

    }
    static class hallgatok{
        int evfolyam;
        String szak;
        String nev;

        public hallgatok(int evfolyam, String szak, String nev) {
            this.evfolyam = evfolyam;
            this.szak = szak;
            this.nev = nev;
        }
    }
}

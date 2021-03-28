import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class legokeszletek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String sor;
        String[] sorok = new String[4];
        legok[] tomb = new legok[n];
        for (int i = 0; i < n; i++){
            sor = sc.nextLine();
            sorok = sor.split(";");
            tomb[i] = new legok(Integer.parseInt(sorok[0]), sorok[1], sorok[2], Integer.parseInt(sorok[3]));
        }
        Arrays.sort(tomb, new comp());
        for(int i = 0; i < n; i++){
            System.out.println(tomb[i].szett_neve + " (" + tomb[i].termekkod + "): " + tomb[i].elemek_szama + " - " + tomb[i].tema_neve);
        }
        System.out.println();
        Arrays.sort(tomb, new comp1());
        for(int i = 0; i < n; i++){
            System.out.println(tomb[i].szett_neve + " (" + tomb[i].termekkod + "): " + tomb[i].elemek_szama + " - " + tomb[i].tema_neve);
        }
    }
    static class legok{
        int termekkod;
        String szett_neve;
        String tema_neve;
        int elemek_szama;

        public legok(int termekkod, String szett_neve, String tema_neve, int elemek_szama) {
            this.termekkod = termekkod;
            this.szett_neve = szett_neve;
            this.tema_neve = tema_neve;
            this.elemek_szama = elemek_szama;
        }
    }
    static class comp implements Comparator<legok> {
        public int compare(legok o1, legok o2){
            if (o1.elemek_szama == o2.elemek_szama){
                if (o1.tema_neve.compareTo(o2.tema_neve) == 0){
                    if (o1.szett_neve.compareTo(o2.szett_neve) == 0){
                        return o2.termekkod - o1.termekkod;
                    }
                    return o1.szett_neve.compareTo(o2.szett_neve);
                }
                return o1.tema_neve.compareTo(o2.tema_neve);
            }
            return o2.elemek_szama - o1.elemek_szama;

        }
    }
    static class comp1 implements Comparator<legok>{
        public int compare(legok o1, legok o2){
            if(o1.tema_neve.compareTo(o2.tema_neve) == 0){
                if (o1.szett_neve.compareTo(o2.szett_neve) == 0){
                   return o1.termekkod - o2.termekkod;
                }
                return o1.szett_neve.compareTo(o2.szett_neve);
            }
            return o1.tema_neve.compareTo(o2.tema_neve);
        }
    }
}

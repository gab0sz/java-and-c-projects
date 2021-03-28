import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class aranymetszes {

    public static class kolyok {
        public String name;
        public double x;
        public double y;

        public kolyok(String name, double x, double y) {
            this.name = name;
            this.x = x;
            this.y = y;
        }
    }

    static class comp implements Comparator<kolyok> {
        public int compare(kolyok o1, kolyok o2) {
            double aranyarany = (1 + Math.sqrt(5)) / 2;
            double idk1 = o1.x/o1.y;
            double idk2 = o2.x/o2.y;
            int res;
            if (Math.abs(aranyarany - idk1) > Math.abs(aranyarany - idk2)) {
                res =  1;
            } else if (Math.abs(aranyarany - idk1) < Math.abs(aranyarany - idk2)) {
                res = -1;
            } else {
                res = 0;
            }
            //return res;
            if (res != 0) return res;
            else{
                return o1.name.compareTo(o2.name);
            }
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        kolyok[] tomb = new kolyok[n];
        for (int i = 0; i < n; i++) {
            String sor = s.nextLine();
            String[] valami = sor.split(":");
            tomb[i] = new kolyok(valami[0], Double.parseDouble(valami[1]), Double.parseDouble(valami[2]));
        }
        //double aranyarany = (1 + Math.sqrt(5)) / 2;
        //System.out.println(aranyarany);
        Arrays.sort(tomb, new comp());

        for (int i = 0; i < n; i++) {
            System.out.println(tomb[i].name + ": " + (int)tomb[i].x + "/" + (int)tomb[i].y);
        }

    }
}

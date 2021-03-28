import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Leltar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();
        while(sc.hasNext()){
            String[] sor = sc.nextLine().split(";");
            String[] datum = sor[1].split("-");
            int ev = Integer.parseInt(datum[0]);
            int ho = Integer.parseInt(datum[1]);
            int nap = Integer.parseInt(datum[2]);
            if (ev < 2019 || (ev == 2019 && ho < 5) || (ev == 2019 && ho == 5 && nap < 8)){
                if (map.containsKey(sor[0])){
                    int k = map.get(sor[0]) + Integer.parseInt(sor[2]);
                    map.replace(sor[0],k);
                }
                else {
                    map.put(sor[0], Integer.parseInt(sor[2]));
                }
            }
        }
        for (Map.Entry<String, Integer> elem: map.entrySet()){
            System.out.println(elem.getKey() + ": " + elem.getValue());
        }
    }
}

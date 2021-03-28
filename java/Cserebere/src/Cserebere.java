import java.sql.SQLOutput;
import java.util.*;

public class Cserebere {
    String nev;
    String idopont;

    public Cserebere(String nev, String idopont) {
        this.nev = nev;
        this.idopont = idopont;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        String ip = s[1];
        int n = Integer.parseInt(s[0]);
        Map <String, Cserebere> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String[] sor = sc.nextLine().split(":");
            Cserebere cs = new Cserebere(sor[0],sor[2]);
            map.put(sor[1],cs);
        }
        while(sc.hasNext()){
            String[] tok = sc.nextLine().split("->");
            String neptun_kod = tok[0];
            String idop = tok[1];

            Cserebere cs = new Cserebere(map.get(neptun_kod).nev,idop);
            map.replace(neptun_kod,cs);
        }
        Map <String, Cserebere> map2 = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int c = map.get(o1).nev.compareTo(map.get(o2).nev);
                if (c != 0) return c;
                c = o1.compareTo(o2);
                return c;
            }
        });

        map2.putAll(map);

        for (Map.Entry<String, Cserebere> elem: map2.entrySet()){
            if (elem.getValue().idopont.equals(ip)){
                System.out.println(elem.getValue().nev + " (" + elem.getKey() + ")");
            }
        }
    }
}

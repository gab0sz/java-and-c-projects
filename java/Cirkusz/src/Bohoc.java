import java.util.*;

public class Bohoc{

    int kerekmeret;
    String nev;

    public Bohoc(int kerekmeret, String nev) {


        this.kerekmeret = kerekmeret;
        this.nev = nev;
    }

    public int getKerekmeret() {
        return kerekmeret;
    }

    public void setKerekmeret(int kerekmeret) {
        this.kerekmeret = kerekmeret;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Bohoc, Integer> map = new HashMap<>();

        while (sc.hasNext()){
            String[] tok = sc.nextLine().split(";");
            Bohoc b = new Bohoc(Integer.parseInt(tok[1]),tok[0]);
            if (!map.containsKey(b)){
                map.put(b,Integer.parseInt(tok[2]));
            }else{

                int k = map.get(b) + Integer.parseInt(tok[2]);
                System.out.println(k);
                map.replace(b,k);
            }

        }
        Map<Bohoc, Integer> map2 = new TreeMap<>(new Comparator<Bohoc>() {
            @Override
            public int compare(Bohoc o1, Bohoc o2) {
                int c = o1.nev.compareTo(o2.nev);
                if (c != 0){
                    return c;
                }
                c = Integer.compare(o1.kerekmeret,o2.kerekmeret);
                return c;
            }
        });

        map2.putAll(map);

        for(Map.Entry<Bohoc,Integer> elem: map2.entrySet()){
            System.out.println(elem.getKey().nev + " (" + elem.getKey().kerekmeret + "): " + elem.getValue());
        }


    }


}

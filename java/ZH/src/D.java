import java.util.*;

public class D {
    int lak;
    ArrayList<String> list = new ArrayList<String>();

    public D(int lak, ArrayList<String> list) {
        this.lak = lak;
        this.list = list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, D> map = new TreeMap<>();
        while(sc.hasNext()){
            String[] sor = sc.nextLine().split(":");
            if (map.containsKey(sor[1])){
                map.get(sor[1]).lak += Integer.parseInt(sor[2]);
                map.get(sor[1]).list.add(sor[0]);
                Collections.sort(map.get(sor[1]).list);
            }else{
                ArrayList<String> l = new ArrayList<>();
                l.add(sor[0]);
                D d = new D;
                d.list = l;
                d.lak = Integer.parseInt(sor[2]);
                map.put(sor[1],d);
            }
        }
        Map<String, D> map2 = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int c = Integer.compare(map.get(o1).lak,map.get(o2).lak);
                if (c != 0) return c;
                c = o1.compareTo(o2);
                return c;
            }
        });
        map2.putAll(map);
        for (Map.Entry<String, D> elem : map2.entrySet()){
            if(Integer.parseInt(args[0]) < elem.getValue().lak){
                System.out.println(elem.getKey() + ": " + elem.getValue().lak + " (" + String.join(",") + ")");
            }
        }
    }
}

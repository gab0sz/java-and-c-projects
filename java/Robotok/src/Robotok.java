import java.util.*;

public class Robotok {
    String nev;
    int win;

    public Robotok(String nev, int win) {
        this.nev = nev;
        this.win = win;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<ArrayList<String>,Robotok> map = new TreeMap<ArrayList<String>,Robotok>(new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        while(sc.hasNext()){
            String[] sor = sc.nextLine().split(";");
            String[] tok1 = sor[0].split(":");
            String[] tok2 = sor[1].split(":");
            if (Integer.parseInt(tok1[1]) > Integer.parseInt(tok2[1])){
                if (map.containsValue(tok1[0])){
                    Robotok r = new Robotok(tok1[0], map.get(tok1[0]).win);
                    for (Map.Entry<ArrayList<String>, Robotok> elem : map.entrySet()){
                        if (elem.getValue().equals(r)){
                            elem.getKey().add(tok2[0]);
                            elem.getValue().win++;
                        }
                    }
                }
                else{
                    ArrayList<String> l = new ArrayList<>();
                    l.add(tok2[0]);
                    Robotok r = new Robotok(tok1[0], 1);
                    map.put(l,r);
                }
            }
            if (Integer.parseInt(tok1[1]) < Integer.parseInt(tok2[1])){
                if (map.containsValue(tok2[0])){
                    Robotok r = new Robotok(tok1[0], map.get(tok2[0]).win);
                    for (Map.Entry<ArrayList<String>, Robotok> elem : map.entrySet()){
                        if (elem.getValue().equals(r)){
                            elem.getKey().add(tok1[0]);
                            elem.getValue().win++;
                        }
                    }
                }
                else{
                    ArrayList<String> l = new ArrayList<>();
                    l.add(tok1[0]);
                    Robotok r = new Robotok(tok2[0], 1);
                    map.put(l,r);
                }
            }
        }
        for(Map.Entry<ArrayList<String>, Robotok> elem : map.entrySet()){
            System.out.println(elem.getValue().nev + " (" + elem.getValue().win + "): " + String.join(",",elem.getKey()));
        }
    }
}

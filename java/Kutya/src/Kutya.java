import java.util.*;

public class Kutya {
    int ar;
    ArrayList<String> nevek = new ArrayList<>();

    public Kutya(int ar, ArrayList<String> nevek) {
        this.ar = ar;
        this.nevek = nevek;
    }

    @Override
    public String toString() {
        return ": " + ar + " (" + String.join(", ",nevek) + ")" ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Kutya> map = new TreeMap<>();
        while(sc.hasNext()){
            String[] sor = sc.nextLine().split("@");
            String[] tok = sor[1].split(",");
            for (int i = 0; i < tok.length; i++){
                if (map.containsKey(tok[i])){
                   map.get(tok[i]).ar += Integer.parseInt(sor[2]);
                   map.get(tok[i]).nevek.add(sor[0]);
                   Collections.sort(map.get(tok[i]).nevek);
                }
                else{
                    ArrayList<String> list = new ArrayList<>();
                    list.add(sor[0]);
                    Kutya k = new Kutya(Integer.parseInt(sor[2]),list);
                    map.put(tok[i],k);
                }
            }
        }
        for (Map.Entry<String,Kutya> elem : map.entrySet()){
            System.out.println(elem.getKey() + elem.getValue().toString());
        }

    }
}

import java.util.*;

public class Kutyavasar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<String>> map = new TreeMap<>();
        while(sc.hasNext()){
            String[] tok = sc.nextLine().split(":");
            String[] varos = tok[1].split(",");
            for (int i = 0; i < varos.length; i++){
                if (map.containsKey(varos[i])){
                    map.get(varos[i]).add(tok[0]);
                    Collections.sort(map.get(varos[i]));
                }else{
                    ArrayList<String> lista = new ArrayList<>();
                    lista.add(tok[0]);
                    map.put(varos[i],lista);
                }
            }
        }
        for(Map.Entry<String,List<String>> elem: map.entrySet()){
            System.out.println(elem.getKey() + ":" + String.join(",",elem.getValue()));
        }
    }
}

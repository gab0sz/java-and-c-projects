import java.util.*;

public class Gyerekek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Set<String>> map = new TreeMap<>();
        while(sc.hasNext()){
            String[] sor = sc.nextLine().split(":");
            String[] ajik = sor[1].split(",");
            if (map.containsKey(sor[0])){
                for (int i = 0; i < ajik.length; i++){
                    map.get(sor[0]).add(ajik[i]);
                }
            }else{
                Set<String> set = new HashSet<>();
                for(int i = 0; i < ajik.length; i++){
                    set.add(ajik[i]);
                }
                map.put(sor[0],set);
            }
        }
        int max = 0;
        for (Map.Entry<String, Set<String>> elem: map.entrySet()){

            if (elem.getValue().size() > max);
                max = elem.getValue().size();

        }
        for (Map.Entry<String, Set<String>> elem: map.entrySet()){
            if (elem.getValue().size() == max){
                System.out.println(elem.getKey());
            }
        }
    }
}

import java.util.*;

public class Ajandek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Set<String>> map = new TreeMap<>();
        while(sc.hasNext())
        {
            String[] tokens = sc.nextLine().split(":");
            String[] ajandekok = tokens[1].split(",");

            for (int i = 0; i < ajandekok.length; i++)
            {
                if (!map.containsKey(tokens[0])) {
                    Set<String> set = new HashSet<>();
                    map.put(tokens[0], set);
                }
                if (map.containsKey(tokens[0])) {
                    map.get(tokens[0]).add(ajandekok[i]);
                }
            }
        }

        int db = 0;
        Map<Integer, List<String>> map2 = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<String, Set<String>> item : map.entrySet())
        {
            db = 0;
            for (String item2 : item.getValue())
            {
                db++;
            }
            if(!map2.containsKey(db))
            {
                List<String> list = new ArrayList<>();
                map2.put(db,list);
            }
            if(map2.containsKey(db))
            {
                map2.get(db).add(item.getKey());
            }
        }


        for (Map.Entry<Integer, List<String>> item : map2.entrySet())
        {
            for (String item2 : item.getValue())
            {
                System.out.println(item2);;
            }
            break;
        }





    }
}

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,Integer> eurovizio = new TreeMap<>();
        Map<Integer, List<String>> eredmeny = new TreeMap<>(Comparator.reverseOrder());
        while(scan.hasNextLine())
        {
            String[] sor = scan.nextLine().split(":");

            if(!eurovizio.containsKey(sor[1]))
            {
                eurovizio.put(sor[1], Integer.parseInt(sor[2]));
            }
            else
            {
                int tmp = eurovizio.get(sor[1]);
                tmp += Integer.parseInt(sor[2]);
                eurovizio.replace(sor[1],tmp);
            }
        }
        for(Map.Entry<String, Integer> i : eurovizio.entrySet())
        {
            if(!eredmeny.containsKey(i.getValue()))
            {
                List<String> lista = new ArrayList<>();
                lista.add(i.getKey());
                eredmeny.put(i.getValue(), lista);
            }
            else
            {
                eredmeny.get(i.getValue()).add(i.getKey());
            }
        }

        for(Map.Entry<Integer, List<String>> i : eredmeny.entrySet())
        {
            i.getValue().sort(String::compareTo);
            System.out.println(i.getKey() + " (" + i.getValue().size() + "): " + String.join(", ",i.getValue()));
        }
    }
}
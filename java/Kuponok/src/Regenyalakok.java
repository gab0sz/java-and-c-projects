import java.util.*;

public class Regenyalakok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<String>> alak = new TreeMap<>();
        while (sc.hasNext()){
            String[] sor = sc.nextLine().split(";|:");
            String[] tok = sor[2].split(",");
            for (int i = 0; i < tok.length; i++){
                if (alak.containsKey(tok[i])){
                    if (!alak.get(tok[i]).contains(sor[0]))
                        alak.get(tok[i]).add(sor[0]);
                }else{
                    List<String> list = new ArrayList<String>();
                    list.add(sor[0]);
                    alak.put(tok[i],list);
                }
            }
        }

        for (Map.Entry<String, List<String>> elem: alak.entrySet()){
            if (elem.getValue().size() >= 2){
                System.out.println(elem.getKey() + ": " + elem.getValue().size());
            }
        }

    }

}

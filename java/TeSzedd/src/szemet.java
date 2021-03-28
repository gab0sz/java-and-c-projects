

import java.util.*;

public class szemet {
    int szemet;
    ArrayList<String> lista = new ArrayList<String>();

    public szemet(int szemet, ArrayList<String> lista) {
        this.szemet = szemet;
        this.lista = lista;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,szemet> map = new TreeMap<>();
        while (sc.hasNext()) {
            String[] sor = sc.nextLine().split(":");
            if (map.containsKey(sor[1])){
                map.get(sor[1]).lista.add(sor[0]);
                Collections.sort(map.get(sor[1]).lista);
                map.get(sor[1]).szemet += Integer.parseInt(sor[2]);
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(sor[0]);
                szemet sz = new szemet(Integer.parseInt(sor[2]),list);
                map.put(sor[1],sz);
            }
        }
        for(Map.Entry<String, szemet> i: map.entrySet()){
            System.out.println(i.getKey() + " (" + i.getValue().szemet +"): " + String.join(", ",i.getValue().lista));
        }
    }
}

import java.util.HashMap;
import java.util.Scanner;

public class Multikulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> m = new HashMap<String,String>();
        while (sc.hasNext()){
            String[] sor = (sc.nextLine()).split(" ");
            if (sor.length != 1){
                if (!m.containsKey(sor[0])) {
                    m.put(sor[0], sor[1]);
                }else if(m.containsKey(sor[0])){
                    if ((m.get(sor[0])).length() > sor[1].length()){
                        m.put(sor[0],sor[1]);
                    }
                }
            }else{
                if (m.containsKey(sor[0])){
                    System.out.println(m.get(sor[0]));
                }else
                    System.out.println("unknown");
            }
        }
    }
}

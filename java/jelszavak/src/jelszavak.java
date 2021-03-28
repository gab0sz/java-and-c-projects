import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class jelszavak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = Integer.parseInt(sc.nextLine());
        String[] sor = new String[n];
        for(int i = 0; i < n; i++){
            sor[i] = sc.nextLine();
        }
        Arrays.sort(sor, new comp());
        for (int i=0; i < n; i++){
            System.out.println(sor[i]);
        }
    }
    static class comp implements Comparator<String>{
        public int compare(String o1, String o2){
            int res;
            if(o1.length()>o2.length()){
                res = -1;
            }
            else if(o1.length()<o2.length()) {
                res =  1;
            }
            else {res = 0;}
            if (res!=0){
                return res;
            }
            else{
                return o1.compareTo(o2);
            }
        }
    }
}

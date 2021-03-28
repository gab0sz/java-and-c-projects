import java.util.Scanner;
public class lotto {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sor;
        int min=85, max=0;
        while (s.hasNextLine())
        {
            sor = s.nextLine();
            String[] valami = sor.split(" ");
            for (int i = 1; i < valami.length; i++){
                if (Integer.parseInt(valami[i]) < min) {
                    min = Integer.parseInt(valami[i]);
                }
                if (Integer.parseInt(valami[i]) > max) {
                    max = Integer.parseInt(valami[i]);
                }
            }
        }
        System.out.print(min);
        System.out.print(" ");
        System.out.println(max);
    }
}
//https://progcont.hu/progcont/100277/?pid=201283
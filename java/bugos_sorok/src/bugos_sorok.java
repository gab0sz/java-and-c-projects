import java.util.Scanner;

public class bugos_sorok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            if (s.toLowerCase().contains("bug"))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

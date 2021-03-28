import java.util.Scanner;

public class forgalom {
    public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int min = n;
            while (s.hasNextInt()) {
                int k = s.nextInt();
                n = n + k;
                if (min > n) {
                    min = n;
                }
            }
            System.out.println(min);
    }
}

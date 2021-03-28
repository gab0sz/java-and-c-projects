import java.text.DecimalFormat;
import java.util.Scanner;

public class atlag {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int num;
        for (int i = 0; i < n; i++){
            num = sc.nextInt();
            sum = sum + num;
        }
        double atlag = (double)sum/(double)n;
        System.out.println(String.format("%.2f", atlag));
    }
}

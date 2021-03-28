import java.util.Scanner;

public class Gombocok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        while(sc.hasNextLine()){
            String[] sor = (sc.nextLine()).split(":");
            sum += Integer.parseInt(sor[1]);
        }
        System.out.println(sum*n);
    }
}

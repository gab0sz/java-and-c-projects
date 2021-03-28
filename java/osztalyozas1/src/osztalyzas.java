import java.util.Scanner;

public class osztalyzas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int pont = sc.nextInt();
            if (pont >=80){
                System.out.println("jeles");
            } else if (pont < 80 && pont >= 70){
                System.out.println("jo");
            } else if (pont < 70 && pont >= 60){
                System.out.println("kozepes");
            } else if (pont < 60 && pont >= 50){
                System.out.println("elegseges");
            } else if (pont < 50){
                System.out.println("elegtelen");
            }
        }
    }
}

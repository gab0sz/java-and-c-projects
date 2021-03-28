import java.util.Scanner;

public class Nagyok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()) {
            String sor = sc.nextLine();
            String[] tomb = sor.split(": |-");
            int szul = Integer.parseInt(tomb[1]);
            int hal = Integer.parseInt(tomb[2]);

            int szulsz = szul / 100;
            int halsz = hal / 100;

            int kor = hal - szul;

            if (szulsz != halsz) {
                System.out.println(tomb[0] + " (" + kor + ")");
            }
        }
    }
}

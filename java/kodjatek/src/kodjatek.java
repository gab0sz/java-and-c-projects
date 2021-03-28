import java.util.Scanner;

public class kodjatek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String sor = sc.nextLine();
            String[] stomb = sor.split("");

            for (int i = 0; i < stomb.length; i = i + 2){
                for (int j = 0; j < Integer.parseInt(stomb[i]); j++){
                    System.out.print(stomb[i+1]);
                }
            }
            System.out.print('\n');
        }
    }
}
//https://progcont.hu/progcont/100297/?pid=201361
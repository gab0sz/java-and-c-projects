import java.util.Scanner;

public class tukrozes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String sor = sc.nextLine();
        while (sc.hasNextLine()){
            String sor = sc.nextLine();
            String[] stomb = sor.split("");
            String[] reversetomb = new String[stomb.length];
            System.out.print(sor+" => ");
            for (int i = stomb.length-1; i>=0; i--){
                System.out.print(stomb[i]);
            }
            System.out.print('\n');
        }
    }


}
//https://progcont.hu/progcont/100297/?pid=201360
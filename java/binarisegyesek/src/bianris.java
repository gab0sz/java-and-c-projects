import java.util.Scanner;

public class bianris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            int i=0;
            int k = Integer.parseInt(s);
            while (k != 0){
                if (k%2 == 1){
                    i++;
                }
                k = k/2;

            }
            System.out.println(i);
        }
    }
}
//https://progcont.hu/progcont/100298/?pid=201365
import java.util.Scanner;

public class RelativPrimek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tmp;
        while(b > 0){
            tmp = b;
            b = a % b;
            a = tmp;
        }
        if (a == 1){
            System.out.println("IGEN");
        }else{
            System.out.println("NEM");
        }
    }
}

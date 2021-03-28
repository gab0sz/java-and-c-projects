import java.util.Scanner;

public class prim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                System.out.println("NEM");
                break;
            }
            else if (n % i != 0 && i == n-1){
                System.out.println("IGEN");
            }
        }
    }
}

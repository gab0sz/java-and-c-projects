
import java.util.Scanner;

public class aritm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a,b;
        while(a != 0 && b != 0){
            String c;
            a = sc.nextInt();
            c = sc.next();
            b = sc.nextInt();
            if (a == 0 || b == 0){
                break;
            }
            if(c.equals("+")){
                System.out.println(a+b);
            }
            if(c.equals("-")){
                System.out.println(a-b);
            }
            if(c.equals("*")){
                System.out.println(a*b);
            }
            if(c.equals("/")){
                System.out.println(a/b);
            }
            if(c.equals("%")){
                System.out.println(a%b);
            }
        }
    }
}


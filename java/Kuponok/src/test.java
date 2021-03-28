import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sor = (sc.nextLine()).split(" ");
        if (sor.length != 1){
            System.out.println("2");
        }else{
            System.out.println("1");
        }
    }
}

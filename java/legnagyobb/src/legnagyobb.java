import java.util.Scanner;

public class legnagyobb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor = new String();
        while (sc.hasNextLine()){
            int max = 0;
            sor = sc.nextLine();
            String[] idk = sor.split(" ");
            if (sc.nextLine()!=""){
            for (int i = 0; i < idk.length; i++){
                if (idk[i].equals("") == false){
                    if (Integer.parseInt(idk[i]) > max){
                        max = Integer.parseInt(idk[i]);
                    }
                }
            }

            System.out.println(max);}
            else {
                System.out.println("unknown");
            }

        }
    }
}

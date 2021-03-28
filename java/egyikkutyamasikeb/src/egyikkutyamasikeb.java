import java.util.Scanner;

public class egyikkutyamasikeb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] idegen = new String[n];
        for (int i = 0; i < n; i++){

            idegen[i] = sc.nextLine();
        }
        int m = Integer.parseInt(sc.nextLine());
        String[] idk = new String[m];
        for(int i = 0; i < m; i++){

            idk[i] = sc.nextLine();
        }
        int k = 1;
        for (int i = 0; i < m; i++){

            for (int j = 0; j < n; j++) {

                if (idk[i].equals(idegen[j])){
                    if (k%2 == 0){
                        idk[i] = "eb";
                        k++;
                    }else {
                        idk[i] = "kutya";
                        k++;
                    }

                }

            }
          //  System.out.println(k);
        }
        for (int i = 0; i < m; i++){
            System.out.println(idk[i]);
        }
    }
}

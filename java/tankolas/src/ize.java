import java.util.Scanner;
import java.util.concurrent.CancellationException;

public class ize {

    public static class megallok
    {
        int megtettut,tankolas;

        public megallok(int megtettut, int tankolas) {
            this.megtettut = megtettut;
            this.tankolas = tankolas;
        }
    }


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int K,L,N,F;
        String[] sor1 = read.nextLine().split(" ");
        K=Integer.parseInt(sor1[0]);
        L=Integer.parseInt(sor1[1]);
        N=Integer.parseInt(sor1[2]);
        F=Integer.parseInt(sor1[3]);
        megallok[] tomb = new megallok[N];
        String sor;
        for (int i = 0; i <N ; i++) {
            sor = read.nextLine();
            String[] sor2 = sor.split(" ");
            tomb[i] = new megallok(Integer.parseInt(sor2[0]),Integer.parseInt(sor2[1]));
        }
        int osszut=0;
        if(K*F<=L) System.out.println("0");

        else
        {   int megalloigmegtett=0;
            for (int i = 0; i < N; i++) {
                if(i==0)
                {
                    L=L-(tomb[i].megtettut*F)+tomb[i].tankolas;
                    osszut+=tomb[i].megtettut;
                    if ((K-osszut)*F<=L)
                    {

                        System.out.println(i+1);

                        break;

                    }
                }
                else
                {
                    megalloigmegtett=tomb[i].megtettut-tomb[i-1].megtettut;
                    L=L-(megalloigmegtett*F)+tomb[i].tankolas;
                    osszut+=tomb[i].megtettut-tomb[i-1].megtettut;
                    if ((K-osszut)*F<=L)
                    {

                        System.out.println(i+1);
                        break;
                    }

                }
            }
        }











    }
}
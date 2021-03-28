using System;

namespace mindencseppszamit
{
    public class megallok
    {
        public int megtettut, tankolas;

        public megallok(int megtettut, int tankolas)
        {
            this.megtettut = megtettut;
            this.tankolas = tankolas;
        }
    }
    
    class Program
    {
        static void Main(string[] args)
        {
            int K, L, N, F;
            string s = Console.ReadLine();
            string[] stomb = s.Split(' ');
            K = int.Parse(stomb[0]);
            L = int.Parse(stomb[1]);
            N = int.Parse(stomb[2]);
            F = int.Parse(stomb[3]);
       
            megallok[] tomb = new megallok[N];
            int i;
            int idk = 0;
            for (i = 0; i < N; i++)
            {
                string sorok = Console.ReadLine();
                string[] sor = sorok.Split(' ');
                tomb[i] = new megallok(int.Parse(sor[0]), int.Parse(sor[1]));

                L = (L - (tomb[i].megtettut-idk) * F) + tomb[i].tankolas;
                
                idk = tomb[i].megtettut;
            }

            L = L - (K - tomb[N-1].megtettut) * F;
            Console.WriteLine(L);
        }
    }
}
//https://progcont.hu/progcont/100277/?pid=201282
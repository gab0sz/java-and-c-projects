using System;
using System.Collections.Generic;

namespace tortaszeleteles
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string[] sor;
            torta[] tomb = new torta[3];
            for (int i = 0; i < n; i++)
            {
                sor = Console.ReadLine().Split(":");
                tomb[i] = new torta(sor[0], int.Parse(sor[1]), int.Parse(sor[2]));
            }
            Array.Sort(tomb, new comp());
            for (int i = 0; i < n; i++)
            {
                Console.WriteLine(tomb[i].tortafajta + " (" + tomb[i].szeletek_szama + " szelet): " + tomb[i].teljes_ar + "Ft");
            }
        }
    }
    class comp : IComparer<torta>
    {
        public int Compare(torta o1, torta o2)
        {
            int res;
            if (o1.teljes_ar / o1.szeletek_szama > (o2.teljes_ar / o2.szeletek_szama)){
                res = 1;
            }
            else if (o1.teljes_ar / o1.szeletek_szama < (o2.teljes_ar / o2.szeletek_szama)){
                res = -1;
            }
            else
                res = 0;
            if (res != 0)
            {
                return res;
            }
            else
            {
                int res2;
                if (o1.szeletek_szama > o2.szeletek_szama)
                {
                    res2 = -1;
                }
                if (o1.szeletek_szama < o2.szeletek_szama)
                {
                    res2 = 1;
                }
                else res2 = 0;
                if (res2 !=0) { return res2; }
                else
                {
                    return o1.tortafajta.CompareTo(o2.tortafajta);
                }
            }
        }
    }
    class torta
    {
        public string tortafajta;
        public int szeletek_szama;
        public int teljes_ar;

        public torta(string tortafajta, int szeletek_szama, int teljes_ar)
        {
            this.tortafajta = tortafajta;
            this.szeletek_szama = szeletek_szama;
            this.teljes_ar = teljes_ar;
        }
    }
}

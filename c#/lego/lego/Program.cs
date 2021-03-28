using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lego
{
    class Legok:IComparable<Legok>
    {
        int termekkod;
        string szett_neve;
        string tema_neve;
        int elemek_szama;

        public Legok(int termekkod, string szett_neve, string tema_neve, int elemek_szama)
        {
            this.termekkod = termekkod;
            this.szett_neve = szett_neve;
            this.tema_neve = tema_neve;
            this.elemek_szama = elemek_szama;
        }

        public override string ToString()
        {
            return szett_neve + " (" + termekkod + "): " + elemek_szama + " - " + tema_neve;
        }

        public int CompareTo(Legok other)
        {
            int c = -elemek_szama.CompareTo(other.elemek_szama);
            if (c != 0) return c;

            c = tema_neve.CompareTo(other.tema_neve);
            if (c != 0) return c;

            c = szett_neve.CompareTo(other.szett_neve);
            if (c != 0) return c;

            c = termekkod.CompareTo(other.termekkod);
            return c;
        }
        public class Sortby : IComparer<Legok>
        {
            public int Compare(Legok x, Legok y)
            {
                int c = x.tema_neve.CompareTo(y.tema_neve);
                if (c != 0) return c;
                c = x.szett_neve.CompareTo(y.szett_neve);
                if (c != 0) return c;
                c = x.termekkod.CompareTo(y.termekkod);
                return c;
            }

           
        }
    }
    class Program
    {

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            Legok[] l = new Legok[n];
            for (int i = 0; i < n; i++)
            {
                string[] tok = Console.ReadLine().Split(';');
                l[i] = new Legok(Convert.ToInt32(tok[0]),tok[1],tok[2],Convert.ToInt32(tok[3]));
            }
            Array.Sort(l);

            for (int i = 0; i < n; i++)
            {
                Console.WriteLine(l[i].ToString());
            }

            Console.WriteLine();

            Array.Sort(l, new Legok.Sortby());
            for (int i = 0; i < n; i++)
            {
                Console.WriteLine(l[i].ToString());
            }
        }

       
    }
}

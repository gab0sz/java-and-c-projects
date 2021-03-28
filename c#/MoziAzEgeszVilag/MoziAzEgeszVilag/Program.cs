using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MoziAzEgeszVilag
{
    class Mozi : IComparable<Mozi>
    {
        string filmcim;
        int ev;
        string rendezo;
        int koltseg;
        int bevetel;

        public Mozi(string filmcim, int ev, string rendezo, int koltseg, int bevetel)
        {
            this.filmcim = filmcim;
            this.ev = ev;
            this.rendezo = rendezo;
            this.koltseg = koltseg;
            this.bevetel = bevetel;
        }

        public int CompareTo(Mozi other)
        {
            int c = -(this.bevetel - this.koltseg).CompareTo(other.bevetel - other.koltseg);
            if (c != 0) return c;
            c = this.ev.CompareTo(other.ev);
            if (c != 0) return c;
            c = -this.bevetel.CompareTo(other.bevetel);
            if (c != 0) return c;
            c = this.filmcim.CompareTo(other.filmcim);
            return c;
        }

        public override string ToString()
        {
            return filmcim;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            Mozi[] m = new Mozi[n];
            for (int i = 0; i < n; i++)
            {
                string[] tok = Console.ReadLine().Split(';');
                m[i] = new Mozi(tok[0], Convert.ToInt32(tok[1]), tok[2], Convert.ToInt32(tok[3]), Convert.ToInt32(tok[4]));
            }
            Array.Sort(m);
            for (int i = 0; i < n; i++)
            {
                Console.WriteLine(m[i].ToString());
            }
            
        }
    }
}

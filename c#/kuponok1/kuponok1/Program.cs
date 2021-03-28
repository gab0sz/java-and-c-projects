using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace kuponok1
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string sor;
            string[] idk;
            
            ISet<kupon> xd = new SortedSet<kupon>(new comp());
            for (int i = 0; i < n; i++)
            {
                sor = Console.ReadLine();
                idk = sor.Split(";");
                kupon valami = new kupon();
                valami.uzlet = idk[0];
                valami.termek = idk[1];
                valami.kedvezmeny = int.Parse(idk[2]);
                xd.Add(valami);
            }
            foreach (var item in xd)
            {
                Console.WriteLine(item.termek + " (" + item.uzlet + "): " + item.kedvezmeny + "%");
            }
        }
    }
    class comp : IComparer<kupon>
    {
        public int Compare(kupon x, kupon y)
        {
            if (x.kedvezmeny == y.kedvezmeny)
            {
                if (x.uzlet.Equals(y.uzlet))
                {
                    return x.termek.CompareTo(y.termek);
                }
                return x.uzlet.CompareTo(y.uzlet);
            }
            return y.kedvezmeny.CompareTo(x.kedvezmeny);
        }
    }
    class kupon
    {
        public String uzlet;
        public String termek;
        public int kedvezmeny;
    }
}

using System;
using System.Collections.Generic;

namespace kuponok
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string sor;
            string[] idk = new string[3];
            kupon valami = new kupon();
            ISet<kupon> xd = new SortedSet<kupon>();
            for (int i = 0; i < n; i++)
            {
                sor = Console.ReadLine();
                idk = sor.Split(";");
                valami.uzlet = idk[0];
                valami.termek = idk[1];
                valami.kedvezmeny = int.Parse(idk[2]);
                xd.Add(valami);
            }
            foreach (var item in xd)
            {
                Console.WriteLine(item.termek+" ("+item.uzlet+"): " + item.kedvezmeny+"%");
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
        public string uzlet;
        public string termek;
        public int kedvezmeny;


    }
}

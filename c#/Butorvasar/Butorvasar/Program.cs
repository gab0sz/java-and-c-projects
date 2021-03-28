using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Butorvasar
{
    class Program
    {
        static void Main(string[] args)
        {
            IDictionary<string, int> butor = new SortedDictionary<string, int>();
            int n = Convert.ToInt32(Console.ReadLine());
            for(int k = 0; k < n; k++)
            {
                string[] tok = Console.ReadLine().Split(':');
                if (butor.ContainsKey(tok[1]))
                {
                    butor[tok[1]]++;
                }
                else
                {
                    butor.Add(tok[1], 1);
                }
            }
            foreach(var elem in butor)
            {
                Console.WriteLine(elem.Key + " - " + elem.Value + " darab");
            }
        }

    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Kutyavasar
{
    class Program
    {
        static void Main(string[] args)
        {
            IDictionary<string, List<string>> dict = new SortedDictionary<string, List<string>>();
            string s;
            while ((s = Console.ReadLine()) != null)
            {
                string[] sor = s.Split(':');
                string[] varos = sor[1].Split(',');
                for (int i = 0; i < varos.Length; i++)
                {
                    if (dict.ContainsKey(varos[i]))
                    {
                        dict[varos[i]].Add(sor[0]);
                        dict[varos[i]].Sort();
                    }
                    else
                    {
                        List<string> lista = new List<string>();
                        lista.Add(sor[0]);
                        dict.Add(varos[i], lista);
                    }
                }
            }
            foreach(var elem in dict)
            {
                Console.WriteLine(elem.Key + ":" + string.Join(",",elem.Value));
            }
        }
    }
}

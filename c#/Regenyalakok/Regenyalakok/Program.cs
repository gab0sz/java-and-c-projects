using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Regenyalakok
{
    class Program
    {
        static void Main(string[] args)
        {
            IDictionary<string, List<string>> r = new SortedDictionary<string, List<string>>();
            string sor;
            while((sor = Console.ReadLine()) != null)
            {
                string[] line = sor.Split(new char[] { ';', ':' });
                string[] tok = line[2].Split(',');
                for (int i = 0; i < tok.Length; i++)
                {
                    if (r.ContainsKey(tok[i]))
                    {
                        if (!r[tok[i]].Contains(line[0]))
                            r[tok[i]].Add(line[0]);
                    }
                    else
                    {
                        List<string> lista = new List<string>();
                        lista.Add(line[0]);
                        r.Add(tok[i], lista);
                    }
                }
            }

            foreach(var elem in r)
            {
                if (elem.Value.Count > 1)
                {
                    Console.WriteLine(elem.Key + ": " + elem.Value.Count);
                }
            }
        }
    }
}

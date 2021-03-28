using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace yh2
{
    public class asd
    {
        public int ido;
        public List<int> lista = new List<int>();

        public asd(int ido, List<int> lista)
        {
            this.ido = ido;
            this.lista = lista;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            string s;
            IDictionary<string, asd> dict = new SortedDictionary<string, asd>();
            int count = 1;
            while ((s = Console.ReadLine()) != null)
            {
                string[] tok = s.Split(':');
                if (dict.ContainsKey(tok[0]))
                {
                    dict[tok[0]].ido += Convert.ToInt32(tok[1]);
                    dict[tok[0]].lista.Add(count);
                    dict[tok[0]].lista.Sort();
                }
                else
                {
                    List<int> l = new List<int>();
                    l.Add(count);
                    asd b = new asd(Convert.ToInt32(tok[1]), l) ;
                    dict.Add(tok[0], b);
                }
                count++;
            }
            foreach (var elem in dict)
            {
                Console.WriteLine(elem.Key + " (" + elem.Value.ido + "): " + string.Join(", ", elem.Value.lista));
            }
        }
    }
}

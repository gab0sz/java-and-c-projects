using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ZH
{
    class B
    {
        int ido;
        List<int> lista = new List<int>();

        public B(int ido, List<int> lista)
        {
            this.ido = ido;
            this.lista = lista;
        }

        static void Main(string[] args)
        {
            string s;
            IDictionary<string, B> dict = new SortedDictionary<string, B>();
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
                    B b = new B(Convert.ToInt32(tok[1]), l);
                    dict.Add(tok[0], b);
                }
            }
            foreach(var elem in dict)
            {
                Console.WriteLine(elem.Key + "(" + elem.Value.ido + string.Join(", ",elem.Value.lista));
            }
        }
    }
}

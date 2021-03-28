using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace KoPapirOllo
{
    class Program
    {
        static void Main(string[] args)
        {
            IDictionary<string, IList<string>> dict = new SortedDictionary<string, IList<string>>();
            string sor;
            while((sor = Console.ReadLine()) != null)
            {
                string[] tok = sor.Split(';');
                if (tok[1].Equals("papir") && tok[3].Equals("ko")||
                    tok[1].Equals("ko") && tok[3].Equals("ollo") ||
                    tok[1].Equals("ollo") && tok[3].Equals("papir"))
                {
                    if (dict.ContainsKey(tok[0]))
                    {
                        dict[tok[0]].Add(tok[1]);
                    }
                    else
                    {
                        IList<string> list = new List<string>();
                        list.Add(tok[1]);
                        dict.Add(tok[0], list);
                    }
                }
                if (tok[3].Equals("papir") && tok[1].Equals("ko") ||
                    tok[3].Equals("ko") && tok[1].Equals("ollo") ||
                    tok[3].Equals("ollo") && tok[1].Equals("papir"))
                {
                    if (dict.ContainsKey(tok[2]))
                    {
                        dict[tok[2]].Add(tok[3]);
                    }
                    else
                    {
                        IList<string> list = new List<string>();
                        list.Add(tok[3]);
                        dict.Add(tok[2], list);
                    }
                }

            }
            foreach (var elem in dict)
            {
                Console.WriteLine(elem.Key + ": " + string.Join(", ",elem.Value));
            }
        }
    }
}

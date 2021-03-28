using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Licitvadaszok
{
    class Program
    {
        static void Main(string[] args)
        {
            string sor;
            IDictionary<string, int> dict = new Dictionary<string, int>();
            while ((sor = Console.ReadLine()) != null)
            {
                string[] tok = sor.Split(';');
                if (tok.Length > 1)
                {
                    if (!dict.ContainsKey(tok[0]))
                    {
                        dict.Add(tok[0], Convert.ToInt32(tok[1]));
                    }
                    else if(dict[tok[0]] < Convert.ToInt32(tok[1]))
                    {
                        dict.Add(tok[0], Convert.ToInt32(tok[1]));
                    }
                }
                else
                {
                    if (dict.ContainsKey(tok[0]))
                    {
                        Console.WriteLine(dict[tok[0]]);
                    }
                    else
                    {
                        Console.WriteLine("unknown");
                    }
                }
            }
             
        }
    }
}

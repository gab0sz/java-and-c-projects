using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace fiuklanyok
{
    
    class Program
    {
        static void Main(string[] args)
        {
            string sor;
            IDictionary<string, string> k = new SortedDictionary<string,string>();
            List<string> kol = new List<string>();
            while((sor = Console.ReadLine())!= null)
            {
                string[] tok = sor.Split(',');
                if (tok.Length > 1)
                {
                    
                    k.Add(tok[0],tok[1]);
                }
                else {
                    kol.Add(tok[0]);
                }
            }
            for (int i = 0; i < kol.Count; i+=2)
            {
                
                if ((k[kol[i]].Equals("male") && k[kol[i+1]].Equals("female")) || (k[kol[i]].Equals("female") && k[kol[i + 1]].Equals("male"))){
                    Console.WriteLine(kol[i] + "-" + kol[i+1]);
                }
            }
        }
    }
}

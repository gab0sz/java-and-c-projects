using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace c_szelsoertekek5
{
    class Program
    {
        static void Main(string[] args)
        {
            string sor;
            while(true)
            {
                sor = Console.ReadLine();
                if (Convert.ToInt32(sor[0]) == 0)
                {
                    break;
                }
                else
                {
                    string[] s = sor.Split(' ');
                    int min = Convert.ToInt32(s[1]);
                    for (int i = 0; i < s.Length - 1; i++)
                    {
                        if (Convert.ToInt32(s[i + 1]) < min)
                        {
                            min = Convert.ToInt32(s[i + 1]);
                        }
                    }
                    Console.WriteLine(min);
                }
            }
        }
    }
}

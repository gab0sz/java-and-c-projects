using System;
using System.Linq;

namespace permutaciok
{
    class Program
    {
        static void Main(string[] args)
        {
            string sor;
            while ((sor = Console.ReadLine()) != null)
            {
                if (sor.Equals("") == true)
                {
                    Console.WriteLine("YES");
                    continue;
                }
                int k = 0;
                int[] sorok = new int[sor.Split(" ").Length];
                for (int i = 0; i < sor.Split(" ").Length; i++)
                    sorok[i] = int.Parse(sor.Split(" ")[i]);
                for (int i = 1; i <= sorok.Max(); i++)
                {
                    if (sorok.Contains(i))
                    {
                        k++;
                    }
                    else k--;
                }
                if (k == sorok.Length)
                {
                    Console.WriteLine("YES");
                }
                else { Console.WriteLine("NO"); }
            }
        }
    }
}

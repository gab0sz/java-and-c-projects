using System;

namespace bugos_sorok
{
    class Program
    {
        static void Main(string[] args)
        {
            string s;
            while ((s = Console.ReadLine()) != null)
            {
                if (s.Contains("bug") || s.Contains("Bug") || s.Contains("bUg") || s.Contains("buG") || s.Contains("BUg") || s.Contains("bUG") || s.Contains("BuG")|| s.Contains("BUG"))
                {
                    Console.WriteLine("YES");
                }
                else { Console.WriteLine("NO"); }
            }
        }
    }
}

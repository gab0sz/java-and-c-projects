using System;

namespace anagramma
{
    class Program
    {
        static void Main(string[] args)
        {
            string sor1 = Console.ReadLine();
            string sor2 = Console.ReadLine();
            String[] s1t = sor1.Split(' ');
            String[] s2t = sor2.Split(' ');
            int[] tomb1 = new int[s1t.Length];
            int[] tomb2 = new int[s2t.Length];
            if (s1t.Length == s2t.Length)
            {
                for (int i = 0; i < s1t.Length; i++)
                {

                    tomb1[i] = int.Parse(s1t[i]);
                    tomb2[i] = int.Parse(s2t[i]);

                }
                Array.Sort(tomb1);
                Array.Sort(tomb2);
                int k = 0;
                for (int i = 0; i < tomb1.Length; i++)
                {
                    if (tomb1[i] == tomb2[i])
                    {
                        k++;
                    }
                }
                if (k == tomb1.Length)
                {
                    Console.WriteLine("YES");
                }
                else
                { Console.WriteLine("NO"); }
            }
            else { Console.WriteLine("NO"); }
        }
    }
}
//https://progcont.hu/progcont/100297/?pid=201358
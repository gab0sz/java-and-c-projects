using System;

namespace tombok_osszefesulese
{
    class Program
    {
        static void Main(string[] args)
        {
            string s1 = Console.ReadLine();
            string s2 = Console.ReadLine();
            string[] s1t = s1.Split(' ');
            string[] s2t = s2.Split(' ');
            if (s1t.Length > s2t.Length)
            {
                string[] ossz = new string[s1t.Length + s2t.Length];
                for (int j = 0; j < s1t.Length; j++)
                {
                    ossz[j] = s1t[j];
                }
                for (int i = s1t.Length; i < ossz.Length; i++)
                {
                    ossz[i] = s2t[i - s1t.Length];
                }
                int[] tomb1 = new int[ossz.Length];
                for (int i = 0; i < ossz.Length; i++)
                {
                    tomb1[i] = int.Parse(ossz[i]);
                }
                Array.Sort(tomb1);
                for (int i = 0; i < ossz.Length; i++)
                {
                    Console.Write(tomb1[i] + " ");
                }
                Console.Write("\n");
            }
            if (s1t.Length < s2t.Length)
            {
                string[] ossz = new string[s2t.Length + s1t.Length];
                for (int j = 0; j < s2t.Length; j++)
                {
                    ossz[j] = s2t[j];
                }
                for (int i = s2t.Length; i < ossz.Length; i++)
                {
                    ossz[i] = s1t[i - s2t.Length];
                }
                int[] tomb1 = new int[ossz.Length];
                for (int i = 0; i < ossz.Length; i++)
                {
                    tomb1[i] = int.Parse(ossz[i]);
                }
                Array.Sort(tomb1);
                for (int i = 0; i < ossz.Length; i++)
                {
                    Console.Write(tomb1[i] + " ");
                }
                Console.Write("\n");
            }
            if (s1t.Length == s2t.Length)
            {
                string[] ossz = new string[s1t.Length * 2];
                for (int i = 0; i < s1t.Length; i++)
                {
                    ossz[i] = s1t[i];
                }
                for (int i = s1t.Length; i < ossz.Length; i++)
                {
                    ossz[i] = s2t[i - s1t.Length];
                }
                int[] tomb1 = new int[ossz.Length];
                for (int i = 0; i < ossz.Length; i++)
                {
                    tomb1[i] = int.Parse(ossz[i]);
                }
                Array.Sort(tomb1);
                for (int i = 0; i < ossz.Length; i++)
                {
                    Console.Write(tomb1[i] + " ");
                }
                Console.Write("\n");
            }
        }
    }
}

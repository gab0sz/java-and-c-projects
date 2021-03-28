using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace d_seregszemle
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            int count = 0;
            for (int i = 0; i < n; i++)
            {
                int k = Convert.ToInt32(Console.ReadLine());
                if (k % 2 == 0 && k > 0)
                {
                    count++;
                }   
            }
            Console.WriteLine(count);
        }
    }
}

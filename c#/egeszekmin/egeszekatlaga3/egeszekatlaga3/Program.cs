using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace egeszekatlaga3
{
    class Program
    {
        static void Main(string[] args)
        {
            int sum = 0;
            int i;
            int count = 0;
            double average;
            while ((i = Convert.ToInt32(Console.ReadLine())) != 0)
            {
                sum = sum + i;
                count++;
            }
            average = sum / (double)count;
            //Console.WriteLine(Math.Round(average,2));
            Console.WriteLine(string.Format("{0:0.00}",average));
        }
    }
}

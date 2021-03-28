using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace egeszekmin
{
    class Program
    {
        static void Main(string[] args)
        {
            int min = Convert.ToInt32(Console.ReadLine());
            string s;
            while((s = Console.ReadLine()) != null)
            {
                if (Convert.ToInt32(s) < min)
                {
                    min = Convert.ToInt32(s);
                }
            }
            Console.WriteLine(min);
            
        }
    }
}

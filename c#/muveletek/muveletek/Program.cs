using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace muveletek
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                string[] s = (Console.ReadLine()).Split(' ');
                int x = Convert.ToInt32(s[0]);
                string op = s[1];
                int y = Convert.ToInt32(s[2]);
                if (x == 0 || y == 0)
                {
                    break;
                }
                else
                {
                    switch (op)
                    {
                        case "+":
                            Console.WriteLine(x + y);
                            break;
                        case "-":
                            Console.WriteLine(x - y);
                            break;
                        
                        case "*":
                            Console.WriteLine(x * y);
                            break;
                        
                        case "/":
                            Console.WriteLine(x / y);
                            break;

                        case "%":
                            Console.WriteLine(x % y);
                            break;
                        
                        default:
                            break;

                    }
                }

            }
        }
    }
}

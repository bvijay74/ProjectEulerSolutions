using System;

namespace Project.Euler
{
    class MultiplesOf3And5
    {
        static void Main(string[] args)
        {
            int sum = 0;
            
            int[] prod = new int[2];            

            for (int i=3; i<1000; i++)
            {
                if ((i%3) == 0)
                {
                    sum += i;
                } else if ((i%5) == 0)
                {
                    sum += i;
                }
            }

            Console.WriteLine("Sum of multiples of 3 and 5 where the product is less than 1000: {0}", sum);
        }
    }
}

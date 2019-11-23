using System;

namespace Assignment12
{
    class Program
    {
        static void Main(string[] args)
        {
            var validation = new Validation();
            //validation.GetCustomerPassword("");
            validation.GetCustomerPassword(null);
            Console.WriteLine("Hello World!");
        }
    }
}

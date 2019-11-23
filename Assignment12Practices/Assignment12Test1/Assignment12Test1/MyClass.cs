
using System;
using System.Collections.Generic;
using System.Diagnostics.Contracts;
using System.Text;

namespace Assignment12Test1
{

    public class MyClass : IMyClass
    {
        public void DoNotPassNull(string str)
        {
            Contract.Requires<ArgumentNullException>(string.IsNullOrEmpty(str), "null string passed");
            Console.WriteLine(str);
        }
    }
}

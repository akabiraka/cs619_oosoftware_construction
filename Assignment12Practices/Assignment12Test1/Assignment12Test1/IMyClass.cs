#define CONTRACTS_FULL
using System;
using System.Collections.Generic;
using System.Diagnostics.Contracts;
using System.Text;

namespace Assignment12Test1
{
    [ContractClass(typeof(IMyClassContract))]
    public interface IMyClass
    {
        void DoNotPassNull(string str);
    }

    [ContractClassFor(typeof(IMyClass))]
    internal abstract class IMyClassContract : IMyClass
    {
        void IMyClass.DoNotPassNull(string str)
        {
            Console.WriteLine("in contract checking");
            Contract.Requires<ArgumentNullException>(string.IsNullOrEmpty(str), "null string passed");
        }
    }
}

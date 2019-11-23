using System.Diagnostics.Contracts;

namespace Assignment12
{
    [ContractClassFor(typeof(IArray))]
    internal abstract class IArrayContract : IArray
    {
        object IArray.this[int index]
        {
            get
            {
                Contract.Requires(index >= 0);
                Contract.Requires(index < ((IArray)this).Count);
                return default(int);
            }
            set
            {
                Contract.Requires(index >= 0);
                Contract.Requires(index < ((IArray)this).Count);
            }
        }

        public int Count
        {
            get
            {
                Contract.Requires(Count >= 0);
                Contract.Requires(Count <= ((IArray)this).Count);
                return default(int);
            }
        }

        public int Add(object value)
        {
            Contract.Ensures(Contract.Result<int>() >= -1, "IArrayContract.Add postC violated");
            Contract.Ensures(Contract.Result<int>() < ((IArray)this).Count, "IArrayContract.Add postC violated");
            return default(int);
        }

        public void Clear()
        {
            Contract.Ensures(((IArray)this).Count == 0);
        }

        public void Insert(int index, object value)
        {
            Contract.Requires(index >= 0);
            Contract.Requires(index <= ((IArray)this).Count);
            Contract.Ensures(((IArray)this).Count == Contract.OldValue(((IArray)this).Count) + 1);
        }

        public void RemoveAt(int index)
        {
            Contract.Requires(index >= 0 && index < ((IArray)this).Count);
            Contract.Ensures(((IArray)this).Count == Contract.OldValue(((IArray)this).Count) - 1);
        }
    }
}
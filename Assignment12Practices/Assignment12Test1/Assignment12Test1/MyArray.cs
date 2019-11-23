using System;
using System.Collections.Generic;
using System.Text;

namespace Assignment12Test1
{
    class MyArray : IArray
    {
        public object this[int index]
        {
            get
            {
                return this[index];
            }
            set
            {

            }
        }

        public int Count => throw new NotImplementedException();

        public int Add(object value)
        {
            throw new NotImplementedException();
        }

        public void Clear()
        {
            throw new NotImplementedException();
        }

        public void Insert(int index, object value)
        {
            throw new NotImplementedException();
        }

        public void RemoveAt(int index)
        {
            throw new NotImplementedException();
        }
    }
}

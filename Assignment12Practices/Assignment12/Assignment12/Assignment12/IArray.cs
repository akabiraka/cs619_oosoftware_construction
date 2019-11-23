using System;
using System.Collections.Generic;
using System.Diagnostics.Contracts;
using System.Text;

namespace Assignment12
{
    // An array is an ordered collection of objects.
    [ContractClass(typeof(IArrayContract))]
    public interface IArray
    {
        Object this[int index]
        {
            get; set;
        }

        int Count
        {
            get;
        }

        //Adds an item to the list.
        //The return value is the position of the new element was inserted in.
        int Add(Object value);

        //Removes all items from the list
        void Clear();

        /*
         * Inserts value into the array at position index.
         * index must be non-negative and less than or equal
         * to the number of the elements in the array. If index
         * equals the number of items in the array, then value is
         * appended to the end.
         */
        void Insert(int index, Object value);

        //Removes an item at position index.
        void RemoveAt(int index);
    }
}

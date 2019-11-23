using System;
using System.Collections.Generic;
using System.Diagnostics.Contracts;
using System.Text;

namespace Assignment12Part1
{
    /*
     * Overview: LiskovIntSets are unbounded, mutable sets of integers
     * AF(c) = c.x1, c.x2, ... ... c.xn where 0 < n <= c.size
     * RedInv: 
     * 1. c.els != null
     * 2. All elements in c.els are integers
     * 3. No duplicate elements in e.els; for any i!=j, els[i]!=els[j]
     *  
     */

    public class LiskovIntSet
    {
        private readonly List<int> els;

        /*
         * initializes this to be empty
         */
        public LiskovIntSet()
        {
            this.els = new List<int>();
        }

        /*
         * Modifies: this
         * Effects: Inserts x into this. 
         */
        public void Insert(int x)
        {
            if (!this.els.Contains(x))
                this.els.Add(x);
            Contract.Ensures(IsIn(x));
            Contract.Ensures(RepOk());
        }

        /*
         * Modifies: this
         * Effects: Removes x from this.
         */
        public void Remove(int x)
        {
            if (this.IsIn(x))
                this.els.Remove(x);
            Contract.Ensures(!IsIn(x));
            Contract.Ensures(RepOk());
        }

        /*
         * Checks whether x is in this or not.
         */
        public bool IsIn(int x)
        {
            return this.els.Contains(x);
        }

        /*
         * Returns this size
         */
        public int Size()
        {
            return this.els.Count;
        }

        /*
         * Effects: If this is empty, throws InvalidOperationException
         * Returns an arbitrary element of this.
         */
        public int Choose()
        {
            if (this.Size() == 0)
                throw new InvalidOperationException("LiskovIntSet is empty");
            return this.els[0];
        }
        //Contract.Requires<InvalidOperationException>(this.els.Count == 0, "LiskovIntSet is empty");
        /*
         * Returns string representation of this.
         */
        public override string ToString()
        {
            return this.els.ToString();
        }

        /*
         * Checks whether rep-inv is ok or not.
         */
        public bool RepOk()
        {
            if (this.els == null) return false;
            for (int i = 0; i < this.els.Count; i++)
                for (int j = 0; j < this.els.Count; j++)
                    if (i != j && this.els[i].Equals(this.els[j]))
                        return false;
            return true;
        }
    }
}

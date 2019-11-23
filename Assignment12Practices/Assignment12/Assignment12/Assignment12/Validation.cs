using System;
using System.Collections.Generic;
using System.Diagnostics.Contracts;
using System.Text;

namespace Assignment12
{
    class Validation
    {
        public string GetCustomerPassword(string customerId)
        {
            //Contract.Requires(!string.IsNullOrEmpty(customerId), "CustomerId must be non-null or non-empty.");
            Contract.Requires<ArgumentNullException>(!string.IsNullOrEmpty(customerId));
            Contract.Ensures(Contract.Result<string>() != null);
            string password = "mypass";
            return password;
        }
    }
}

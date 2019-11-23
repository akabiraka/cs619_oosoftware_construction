using Assignment12Part1;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Diagnostics.Contracts;

namespace UnitTestProject2
{
    [TestClass]
    public class Assignment12Part1UnitTests
    {
        [TestMethod]
        public void test()
        {
            Assert.IsTrue(true);
        }

        [TestMethod]
        public void TestInsert()
        {
            LiskovIntSet set = new LiskovIntSet();
            set.Insert(1);
            set.Insert(1);
            set.Insert(1);
        }

        [TestMethod]
        public void TestChoose()
        {
            LiskovIntSet set = new LiskovIntSet();
            Assert.ThrowsException<InvalidOperationException>(() => set.Choose());
        }
    }
}

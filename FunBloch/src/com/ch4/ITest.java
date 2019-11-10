package com.ch4;

public interface ITest {
	int getA();

	int getB();

	int getC();

	default int getD() {
		return 34;
	}
}

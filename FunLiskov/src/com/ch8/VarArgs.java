package com.ch8;

import java.util.Optional;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1, 2, 3));
		System.out.println(sum());
		System.out.println(min(1, 2, 3, -1));
//		System.out.println(min());
		
		int[] x = new int[0];
		System.out.println(x.length);
		System.out.println(Optional.empty());
	}

	// Simple use of varargs
	static int sum(int... args) {
		int sum = 0;
		for (int arg : args)
			sum += arg;
		return sum;
	}

	// The WRONG way to use varargs to pass one or more arguments!
	static int min(int... args) {
		if (args.length == 0)
			throw new IllegalArgumentException("Too few arguments");
		int min = args[0];
//		for (int i = 1; i < args.length; i++)
//			if (args[i] < min)
//				min = args[i];
		for (int arg: args) {
			if (arg < min)
				min = arg;
		}
		return min;
	}
}

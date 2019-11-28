package com.ch4;

import java.io.IOException;

public class Main {
	public static void main(String args[]) {
		try {
			testException();
		} catch (IOException e) {
			System.out.println("parent fixing ... ...");
		}
		System.out.println("parent fixed ... ...");
		testUncheckedException();
		System.out.println("after tesing UE ... ...");
	}
	
	public static void testException() throws IOException{
//		try {
//			throw new NullPointerException("NPE");
//		} catch (NullPointerException e) {
//			System.out.println("fixing exception ... ....");
//		}
		throw new IOException();
		//System.out.println("Exception fixed ... ...");
	}
	
	public static void testUncheckedException() {
//		throw new NullPointerException();
		throw new UnsupportedOperationException();
	}
}

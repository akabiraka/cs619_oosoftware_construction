package com.ch6;

public class IntEnumPattern {
	public static final int APPLE_FUJI = 0;
	public static final int APPLE_PIPPIN = 1;
	public static final int APPLE_GRANNY_SMITH = 2;

	public static final int ORANGE_NAVEL = 0;
	public static final int ORANGE_TEMPLE = 1;
	public static final int ORANGE_BLOOD = 2;

	public void isFUJIApple(Apple apple) {
		if (apple == Apple.FUJI) {
			System.out.println(apple);
		}
	}
}

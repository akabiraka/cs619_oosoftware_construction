package com.ch3;

public class SubPhoneNumber extends PhoneNumber implements Cloneable{
	private final String extraAttr;

	public SubPhoneNumber(int areaCode, int prefix, int lineNum, String extraAttr) {
		super(areaCode, prefix, lineNum);
		this.extraAttr = extraAttr;
	}
	
//	@Override
//	protected SubPhoneNumber clone () {
//		SubPhoneNumber subPhoneNumber = (SubPhoneNumber)super.clone();
//		subPhoneNumber.extraAttr = "extra attr";
//		return new SubPhoneNumber(areaCode, prefix, lineNum, extraAttr);
//	}

}

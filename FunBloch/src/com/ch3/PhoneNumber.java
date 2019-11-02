package com.ch3;

public class PhoneNumber implements Cloneable {
	private final short areaCode, prefix, lineNum;

	public PhoneNumber(int areaCode, int prefix, int lineNum) {
		// TODO Auto-generated constructor stub
		this.areaCode = rangeCheck(areaCode, 999, "area code");
		this.prefix = rangeCheck(prefix, 999, "prefix");
		this.lineNum = rangeCheck(lineNum, 999, "line num");
	}

	private short rangeCheck(int val, int max, String arg) {
		if (val < 0 || val > max) {
			throw new IllegalArgumentException(arg + ": " + val);
		}
		return (short) val;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PhoneNumber)) {
			return false;
		}
		PhoneNumber other = (PhoneNumber) o;
		return other.areaCode == this.areaCode && other.prefix == this.prefix && other.lineNum == this.lineNum;
	}

	@Override
	public String toString() {
		return String.format("%03d-%03d-%04d", areaCode, prefix, lineNum);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + areaCode;
		result = prime * result + lineNum;
		result = prime * result + prefix;
		return result;
	}

	@Override
	protected PhoneNumber clone() throws CloneNotSupportedException {
		try {
			return (PhoneNumber)super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}

}

package com.ch3;

import java.util.Objects;

public class CaseInsensitiveString {
	private final String s;

	public CaseInsensitiveString(String s) {
		// TODO Auto-generated constructor stub
		this.s = Objects.requireNonNull(s);
	}

	@Override
	public boolean equals(Object o) {
		return o instanceof CaseInsensitiveString && ((CaseInsensitiveString) o).s.equalsIgnoreCase(this.s);
	}
}

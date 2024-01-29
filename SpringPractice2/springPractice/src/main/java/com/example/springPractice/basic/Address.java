package com.example.springPractice.basic;

public class Address {
	private int hno;
	private String adrs;
	
	public Address() {
		super();
	}

	public Address(int hno, String adrs) {
		super();
		this.hno = hno;
		this.adrs = adrs;
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getAdrs() {
		return adrs;
	}

	public void setAdrs(String adrs) {
		this.adrs = adrs;
	}

//	@Override
//	public String toString() {
//		return "Address [hno=" + hno + ", adrs=" + adrs + "]";
//	}
	
	
}

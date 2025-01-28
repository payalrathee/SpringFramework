package spring.SpringPractice;

public class Address {

	private int hno;
	private String area;
	private String city;
	private String Country;
	
	
	
	public Address() {
		System.out.println("Address constr");
	}

	public Address(int hno, String area, String city, String country) {
		super();
		this.hno = hno;
		this.area = area;
		this.city = city;
		Country = country;
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", area=" + area + ", city=" + city + ", Country=" + Country + "]";
	}
	
	public void init() {
		System.out.println("init...");
	}
	
	public void destroy() {
		System.out.println("destroy...");
	}
	
}

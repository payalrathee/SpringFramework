package basicAnnot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("1011")
	private int hno;
	
	@Value("Laughing Street")
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

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", adrs=" + adrs + "]";
	}
	
	
}

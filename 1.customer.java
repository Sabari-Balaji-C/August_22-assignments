package Cust_prj;

import java.util.Date;

public class customer {

	 int custId;
	 String custName;
	 String city;
	 double premium;
	 Date dateOfBirth;
	 
	public customer(int custId, String custName, String city, double premium, Date dateOfBirth) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.city = city;
		this.premium = premium;
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "customer [custId=" + custId + ", custName=" + custName + ", city=" + city + ", premium=" + premium
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}

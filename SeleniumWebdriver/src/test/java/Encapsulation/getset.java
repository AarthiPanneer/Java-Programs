package Encapsulation;

public class getset {
	
	private int accountno;
	private String name;
	private double Balanceamount;
	
	public void setAccoutno(int accountno) {
		this.accountno = accountno;
	}
	public int getAccountno() {
		return accountno;
	}
	void setName(String name) {
		this.name = name;
	}
	String getname() {
		return name;
	}
	void setAmount(double Balanceamount ) {
		this.Balanceamount=Balanceamount;
	}
	double getamount() {
		return Balanceamount;
	}
	
	

}

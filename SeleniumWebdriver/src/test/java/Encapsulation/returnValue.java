package Encapsulation;

public class returnValue {

	public static void main(String[] args) {
		getset value = new getset();
		 value.setAccoutno(1234567);
		 System.out.println(value.getAccountno());
		 value.setName("Sirippu papa");
		 System.out.println(value.getname());
		 value.setAmount(21000.90);
		 System.out.println(value.getamount());

	}

}

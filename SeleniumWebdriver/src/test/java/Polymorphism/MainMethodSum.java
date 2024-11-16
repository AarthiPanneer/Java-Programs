package Polymorphism;

public class MainMethodSum {

	public static void main(String[] args) {
		addmethod addObj = new addmethod();//addmethod is class name 
		
		// passing value.
		
		addObj.sum(); // Sum is method name 
		addObj.sum(10, 20);
		addObj.sum(10, 20.9);
		addObj.sum(2, 9);
		addObj.sum(10, 20, 30);

	}

}

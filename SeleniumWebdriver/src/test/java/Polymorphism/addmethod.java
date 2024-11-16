package Polymorphism;

// Method Overloading - Method 

public class addmethod {

	int X = 10 ,  Y = 20;
	
	void sum()//without Parameter 
	{
		System.out.println(X+Y);

	}
	
	void sum(int X , int Y) // With 2 data type parameter
	{
		System.out.println(X+Y);
	}
	void sum(int X , double Y) // With 2 diff data type parameter
	{
		System.out.println(X+Y);
	}
	void sum(double X , int Y) // with 2 diff data type parameter with differnt variable
	{
		System.out.println(X+Y);
	}
	void sum(int X,int Y, int Z)
	{
		System.out.println(X+Y+Z);
	}

}

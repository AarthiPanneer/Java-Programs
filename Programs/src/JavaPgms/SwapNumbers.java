package JavaPgms;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 10 , b= 20;
		
//		System.out.println("Before Swapping the numbers of a and b"+"  "  +a+" "+b);
//		
//		//logic 1 - With using third variables
//		int t= a; // t=10
//	    a=b; // a=20
//	    b=t;//b=10
//	    
//	    System.out.println("After swapped the value of a and b....."+a+" "+b);
	    
	    //logic 2 - Without using third variable and using + and - operator
	    
//	    System.out.println("Before Swapping the numbers of a and b"+"  "  +a+" "+b);
//	    
//	    a=a+b;
//	    b=a-b;
//	    a=a-b;
//	    System.out.println("After swapped the value of a and b....."+a+" "+b);
	    
	    //Login 3 - using * and / operator
	    
//	    System.out.println("Before Swapping the numbers of a and b"+"  "  +a+" "+b);
//	    
//	    a=a*b;
//	    b=a/b;
//	    a=a/b;
//	    System.out.println("After swapped the value of a and b....."+a+" "+b);
	    
	    //Logic 4 using single statement.
	    System.out.println("Before Swapping the numbers of a and b"+"  "  +a+" "+b);
	    
	    b=a+b-(a=b);
	    System.out.println("After swapped the value of a and b....."+a+" "+b);
	    

	    
	    
	    
	    
	    
	    
		

	}

}

package JavaPgms;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
	    System.out.println("Enter the value");
	    
	    int num = sc.nextInt();
	    
	    int Org_Num = num;
	    
	    int rev =0;
	    
	    while(num!=0) {
	    	rev = rev*10 + num%10;
	    	num=num/10;
	    }
	    System.out.println(rev);
	    
	    if(Org_Num==rev) {
	    	System.out.println("Palindrome number");
	    }
	    else
	    {
	    	System.out.println("Not Palindrome number");
	    }
	    
	    
	    
	
		
	}

}

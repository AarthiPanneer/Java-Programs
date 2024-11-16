package JavaPgms;

import java.util.Scanner;
import java.util.StringJoiner;

public class RevNumber {
	

	public static void main(String[] args) {
		
		int num1 =98372;
	
		
//		//lOGIC 1 using algorithem
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value :");
//		int num=sc.nextInt();
//		
//		int rev=0;
//		
//		while(num!=0) {
//			
//			rev=rev*10 + num%10;
//			
//			num=num/10;
//		}
//			
//			System.out.println("Reversed the number:" +rev);
//			
//		}
	
	//Using StringBuffer class
	
//	StringBuffer s = new StringBuffer(String.valueOf(num1));
//	StringBuffer rev=s.reverse();
//	
//	System.out.println(rev);
//	
//   
//	}
	
	//Using Stringbuilder class
	
	 StringBuilder sb = new StringBuilder();
	 sb.append(num1);
	 StringBuilder rev = sb.reverse();
	 System.out.println(rev);
	}
}


	
	
	

	
	
	
	
		
		
		

	



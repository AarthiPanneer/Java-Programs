package JavaPgms;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name :");
	String name = sc.next();
	
	String Org_name = name;
	String rev =" ";
	
	int len = name.length();
	
	for(int i=len-1;i>=0;i--) {
		
		rev = rev+name.charAt(i);
	}
	
	if(Org_name.equals(rev)) {
		System.out.println("Palindrom string");
	}
	else {
		System.out.println("Not Palindrom string");
	}
	}
}





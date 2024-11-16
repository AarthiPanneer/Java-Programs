package JavaPgms;

import java.util.Arrays;
import java.util.Collections;

public class SortElementArrayBuiltIn {

	public static void main(String[] args) {
		int a[]= {28,77,91,10,9};
		System.out.println("Before sorting the array:"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting the array:"+Arrays.toString(a));
		
		//Reverse decending order
		
	  Integer b[]= {89,200,79,0,38};// why we use Integer wrapper class means the collection.reverse order doesnot support primitive data type
		
		System.out.println("Before sorting the array:"+Arrays.toString(b));
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println("After sorting the array:"+Arrays.toString(b));
	}
}


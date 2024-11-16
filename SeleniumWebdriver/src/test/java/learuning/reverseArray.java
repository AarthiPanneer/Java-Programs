package learuning;

import org.bouncycastle.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		//Print the array in reverse 
		
		// Note : enhanced for loop will not work we can use normal for loop
		
		int a[]= {10,20,30,40,50};
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
			
		}
		

	}

}

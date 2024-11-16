package JavaPgms;

import java.util.Arrays;

public class Largest2ndNumArray {

	public static void main(String[] args) {
		int num[]= {1,20,30,40};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println(num[num.length-2]);

	}

}

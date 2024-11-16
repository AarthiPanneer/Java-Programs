package JavaPgms;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		int Num = 123445678;
		
		int count = 0;
		
		while(Num>0) {
			
			
			Num=Num/10;
			count++;
		}
		
		System.out.println(count);

	}

}

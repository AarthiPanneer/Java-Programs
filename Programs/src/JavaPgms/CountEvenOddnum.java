package JavaPgms;

public class CountEvenOddnum {

	public static void main(String[] args) {
		int num=123456789;
		
		int odd_count =0;
		int even_count =0;
		
		while(num>0) {
			int rem=num%10;
			if(num%2==0) {
				even_count++;
			}
			else {
				
				odd_count++;
			}
			num=num/10;
		}
			
			System.out.println(odd_count);
			
			System.out.println(even_count);
			
		

	}

}



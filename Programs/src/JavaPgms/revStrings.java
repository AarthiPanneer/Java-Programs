package JavaPgms;

public class revStrings {

	public static void main(String[] args) {
		
		String a = "Aarthi Panneerselvam";
		String rev ="";
		
		int len = a.length();
		
//		for (int i=len-1;i>=0;i--) {
//			
//			rev=rev+a.charAt(i);
//		}
//		
//		System.out.println(rev);
		
		//using Charactor array
		
		char r[] = a.toCharArray();
		
		for (int i=len-1;i>=0;i--) {
			 rev = rev+r[i];
		}
		
		System.out.println(rev);
			 
			
		}
		
		
		

	

}


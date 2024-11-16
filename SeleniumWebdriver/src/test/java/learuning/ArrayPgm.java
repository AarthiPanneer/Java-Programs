package learuning;

public class ArrayPgm {

	public static void main(String[] args) {
		/*int i[] = { 0 , 1 , 2 , 3 , 4 };
		
		System.out.println(i[4]);
		
		*/
		
		//Ex1 : Search an element in array (linear search)
		
		int a [] = {10 , 20 , 30 , 50 , 60};
		int search_element = 10;
		
		boolean status = false; //false - not found , true - found 
		
		//Approach 1 - for loop  // Approach - 2 - Enhanced for loop

		for (int i = 0 ; i<a.length; i++) // for(int x : a)
		{
			if(a[i] ==search_element) // if (x== search_element)
			{
				System.out.println("Elements found");
				status = true;
				break;
			}

		}
		if(status == false) 
		{
		System.out.println("Elements not found");
	
		}
	}
}



		
	
	
	


	



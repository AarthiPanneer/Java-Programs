package learuning;

public class Arraypgm2 {

	public static void main(String[] args) {
		 //Example 2 - Find number of repeatations (Find How many duplicates in array)
		
		int a[] = {100,200,100,300,100,400,100};
		
		int num=100; // Static 
	    int count=0;
	
	for(int value:a) 
	{
		if(value==num) 
		{
			count++; // 1 2 3
		}
	}
	
	System.out.println(count);
		

	}

}

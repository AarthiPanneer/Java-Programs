package learuning;

public class Operators {

	public static void main(String[] args) {
		//1.Arithmetic Operators
		
		int a=10,b=20;
		
		int result = a+b; // different approach for store the operator in var and print.
		System.out.println("Sum of a and b is:" +(a+b));
		System.out.println("Diff of a and b is:" +(a-b));
        System.out.println("Mulitiplication of a and b is:" +(a*b));
        System.out.println("Division of a and b is:" +(a/b));
        System.out.println("modulues of a and b is:"+(a%b));
        
        //2.Relational/Comparision Operator
        
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a!=b);
        System.out.println(a==b);
        
        boolean result1 = a>b;
        System.out.println(result1);
        
        //3.Logical operators - && , || , !
        
        boolean x1 = true;
        boolean y1 = false;
        
        System.out.println(x1&&y1);
        System.out.println(x1||y1);
        System.out.println(!x1);
        
        // diff approach in logical operators
        
       boolean b1 = 10>20;
       
       System.out.println(b1);
       
       //
       
       //4.Increment / Decrement Opearator 
       
       int z = 10;
       z++;//z=z+1
       System.out.println(z); 
       
       //POST Increment 
       
       int w = 20;
       int resultx = w++;
       System.out.println(resultx); //20
       System.err.println(w); // 21 // First assignment will happen after than incrementation will happen
       
       //Pre-Increment 
       
       int w1 = 20;
       
       int Result3 = ++w1;
       
       System.out.println(Result3);//First incrementation will happen after assignement will happen
       
       // Decrement 
       
       //Decrement Opearator 
       
       int x2=10;
       x2--; // x1=x1-1
       System.out.println(x2);
       
       //post-Decrement 
       
       int x4 = 100;
       
       int result_Value = x4--;
       
       System.out.println(result_Value);//100 why there is no decrement means , first assignemt will happen after than decrement will happen/.
       
       System.out.println(x4);//99
       
       //pre - Decrement 
       
       int x5 = 200;
       
       int result_value1 = --x5;
       
       System.out.println(result_value1);
       
       //5.Assignment operator(>=,+=,-+,*=,/=,%=)
       
       int z1 = 10;
       z1+=5;//z=z+5
       System.out.println(z1);
       
       //6.Ternary operator
       
       //Syntax : Var = expression?a:b;
    		   
       
      
       
       
      
       
       
        
        
        
        
        	
	}

}

// File learncondition.java
// Conditional branch statement and trinitarian operator

/*-----------Syntax--------------*/
// 1. if <condition>
//    {block statement}

// 2. if <condition>  
//    {block statement 1}
//   else {block statement 2}

// 3. if <condition 1>
//    {block statement 1}
//   else if <condition 2>
//    {block statement 2}
//   ...
//   else {block statement n}

// 4. Condition ? Value 1: Value 2 ;
// If true, return value 1
// If false, return value 2 

package learnconditon;
import java.util.Scanner;

public class learncondition {
	public static void main(String[] args) {
		// Condition if
		Scanner input =new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int max;
		
		max=a;
		if (a<b) {
			max=b;
		}
		System.out.println("Max a and b: "+max);
		input.close();
		
		// Condition if-else
        if(a>b)
        {
            max =a;
        }
        else{
            max =b;
        }
        
        // Condition if-else if-else
        int k =-1;
        if (k==6){
        	System.out.println(k+" is a number equal to 6");
        }
        else if (k>6){
        	System.out.println(k+" is a number greater than 6");
        }
        else if (0<k  && k<6 ){
        	System.out.println(k+" is a number less than 6");
        }
        else
        	System.out.println(k+" is a number nagetive");
        
        // Trinitarian operator
        String root="Lambda";
        boolean s=root=="Lambda"?true:false;
        System.out.println(s);
	}
}

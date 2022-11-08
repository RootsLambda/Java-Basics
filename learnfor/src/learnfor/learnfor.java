// File learnfor.cs
// Structure loop for

/*-----------Syntax--------------*/
// for(start_variable_loop,end_variable_loop,step)
//   {
//    <statement>;
//   }

package learnfor;

public class learnfor {
	public static void main(String[] args) {
		int sum=0;
		for (int k=1; k<10;k++) {
			sum=sum+k;
		}
		System.out.println("Sum 1 to 10: "+sum);
	}
}

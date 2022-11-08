// File learnforeach.java
// Introduce loop for each

/*-----------Syntax--------------*/
// for(datetype <item> : items )
// {
//   <statement>;
// }

package learnforeach;

public class learnforeach {
	public static void main(String[] args) {
		int[] arrayA={1,4,5,5,6,2};
		
        int Sum=0; 
        for(int item:arrayA)
        {
            Sum+=item;
        }
        System.out.println("Sum = "+Sum);
	}
}

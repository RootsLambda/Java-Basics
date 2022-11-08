// File learnarray.java
// Concept array java

/*-----------Syntax--------------*/
// <type_array>[length] <name_array> = new <type_array>[length] {element 1, element 2, ...};

// /*-------------Note------------*/
// 1.The new keyword helps to allocate memory may or may not
// 2.Character arrays are views as character strings
// 3.The ends element of the array must be null '\0'

package learnarray;

public class learnarray {
	public static void main(String[] args) {
		
		// Array 1 demension
		int[] A= {1,2,3,4,5};
		
		int[] B=new int[10];
		
		String[] C=new String[] {"Roots","Lambda"};
		
		for (int i=0; i<A.length;i++) {
			System.out.println(A[i]);
		}
		
		for (int i=0; i<C.length;i++) {
			System.out.println(C[i]);
		}
		
		// Array 2 dimension
		String[][] D= new String[4][4];
		
		int[][] E=new int[][] {
			{1,2,3},
			{3,4,5},
			{6,7,9}
		};
		
		for (int i=0; i<E.length;i++) {
			for (int j=0; j<E[i].length;j++) {
				System.out.println(E[i][j]);
			}
		}
		
		
	}
}

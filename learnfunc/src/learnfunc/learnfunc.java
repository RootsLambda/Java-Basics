// File learnfunc.java
// Show us function basics

/*-----------Syntax--------------*/
// <Access modifier ><Keyword> <Return_type> <name function>(type variable1, type variable2, .....)
// {
//          <Statement>;
// return value 
// }

/*-----------Note--------------*/
// 1. If return type 'void' will no return value
// 2. Keyword can public, static, read only, private
// 3. Return Type: int, long, double, void
// 4. Parameters inside the function

package learnfunc;

public class learnfunc {
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static void printA() {
		System.out.println("Lambda");
	}
	public static void main(String[] args) {
		System.out.println("Result add: "+add(3,4));
		printA();
	}
}

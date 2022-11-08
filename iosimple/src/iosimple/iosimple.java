// File iosimple.java
// Introduction to simple input, annotation commands

/*-------------Note------------*/
// 1. Use import to declare a library Scanner for keyboard input
// 2. The public keyword is only public
// 3. Static is a keyword and void returns no value
// 4. Entry point of the program starts function main(String[] args)
// 5. Output using the function System.out.print()
// 6. Output and next new line using the function System.out.println()
// 7. To enter data, we create an object of the Scanner class 
// 8. This object will help us get the user input value
// 9. Use method of Scanner class for each data type
// 10. We should call close() to close the Scanner object when not in use

package iosimple;
import java.util.Scanner;

public class iosimple {
	public static void main(String[] args) {
		System.out.print("Lambda");
		System.out.print(10);
		System.out.print(true);
		
		System.out.println("Hello world! ");
		System.out.print("Hello world!\n");
		
		int age=21;
		System.out.println("Roots"+"Lambda");
		System.out.println("Age: "+age);
		
		Scanner input =new Scanner(System.in);
		int a=input.nextInt();
		System.out.println(a);
		
		float b=input.nextFloat();
		System.out.println(b);
		
		String message=input.next();
		System.out.println(message);
		
		input.close();
	}
}

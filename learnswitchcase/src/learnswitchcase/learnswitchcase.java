// File learnswitchcase.java
// No Conditional branch statement

/*-----------Syntax--------------*/
// switch (<expression>){
// case value 1: block 1; break;
// case value 2: block 2; break;
// ....
// default:
//     block 0;
//     break;
// }

package learnswitchcase;

public class learnswitchcase {
	public static void main(String[] args) {
		 int n = 40;
         switch (n)
                 {
                 case 0: 
                         System.out.println("Hello");
                         break;
                 case 20: 
                	 	 System.out.println("World");
                         break;
                 case 40: 
                	 	 System.out.println("Lambda");
                         break;
                 default:
                	     System.out.println("Roots");
                         break;
                 }
	}
}

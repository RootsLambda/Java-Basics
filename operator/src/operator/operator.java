// File operator.java
// Introduction to common operators in java


package operator;

public class operator {
	public static void main(String[] args) {
		// 1.Arithmetic expression
		int a=4, b=5;
		System.out.println("Add: "+(a+b));
		System.out.println("Subtract: "+(a-b));
		System.out.println("Mutily: "+ (a*b));
		System.out.println("Divide: "+(float)a/b);
		
		// 2.Comparison expression
		float c=4.5f, d=3.4f;
		System.out.println("Operator '>' is greater: "+(c>d));
		System.out.println("Operator '<' is less: "+(c<d));
		System.out.println("Operator '==' is equality: "+(c==d));
		System.out.println("Operator '!=' is not equality: "+(c!=d));
		
		// 3.Logical operator
		boolean e =true, f= false;
		System.out.println(!e);
		System.out.println(e && f);
		System.out.println(e||f);
        
		// 4. Complex expression
		int r = 3;
        double area = 3.14*r*r;
        System.out.println("Area is cricle: "+area);
        
        // 5.Squeeze style
        
        int g =300;
        byte h =(byte)g;
	}
}

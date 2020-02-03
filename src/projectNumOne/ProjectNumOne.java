package projectNumOne;

  public class ProjectNumOne {

	public static void main(String[] args) {

//// Arithmetic Operators.
		
		int one = 55;
		int two = 102;
		int three = 180;
		int four = 20;
			
		int additionResults = one + three;
	    int substractionResults = one - four;
		int multiplicationResults = one * 6;
		int divisionResults = three/6;
		int modelaResults = three%four;
		
		//int postIncrementResults = two++; 
		//int postDecrementResults = two--;
		int preIncrementResults = ++two;
		int preDecrementResults = --two;
		
		System.out.println("Add Results are = " + additionResults);
	    System.out.println("SubstractionResults =" + substractionResults);
		System.out.println("MultiplicationResults Results are =" + multiplicationResults);
		System.out.println("DivisionResults Results are =" + divisionResults);
		System.out.println("The Model Results are =" +modelaResults);
		//System.out.println("PostIncrementResults Results are =" + postIncrementResults);
		//System.out.println("PostDecrementResults Results are =" + postDecrementResults);
		System.out.println("PreIncrementResults Results are =" + preIncrementResults);
		System.out.println("PreDecrementResults Results are =" + preDecrementResults);
	
		
		
//// Relational Operators.
		
		
		long firstNumber = 1980;
		long secondNumber = 1956;
		long thirdNumber = 260;
		long FourthNumber = 1821;
		long FifthNmber = 310;
		
		boolean equals = firstNumber == thirdNumber;
		boolean notEquals = thirdNumber !=22;
		boolean greaterThan = secondNumber>33332;
		boolean lessThan = FourthNumber < FifthNmber;
		boolean greaterThanOrEqualTo = firstNumber >= secondNumber;
		boolean lessThanOrEqualTo = FourthNumber <= 234234;
		
		System.out.println("equals Results are = " + equals);
		System.out.println("notEquals Results are = " + notEquals);
		System.out.println("greaterThan Results are = " + greaterThan);
		System.out.println("lessThan Results are = " + lessThan);
		System.out.println("greaterThanOrEqualTo Results are = " + greaterThanOrEqualTo);
		System.out.println("lessThanOrEqualTo Results are = " + lessThanOrEqualTo);
		
		
//// Logical Operators.
		
		int l = 8;
		int o = 8;
		int g = 6;
		int i = 7;
		int c = 2;
		
		
		boolean booleanresults1 = ((o==l)&&(g==i));
		boolean booleanresults2 = ((o==l)||(i==c));
		boolean booleanresults3 = !((o==l)&&(g==i));
	
		System.out.println(booleanresults1);
		System.out.println(booleanresults2);
		System.out.println(booleanresults3);
		

//// Assignment Operators
		
		int w = 2;
		int x = 4;
		int y = 8;
		int z = 10;
		
		System.out.println(w); 
		
		w+=x;
		
		System.out.println("W is " + w);
		
		y-=x;
		
		System.out.println("Y is " + y);
		
		z*=y;
		
		System.out.println("Z is " + z);
		
		y/=x;
		
		System.out.println("Y is " + y);
		
		z%=w;
		
		System.out.println("Z is " + z);
		
		w<<=y;
		
		System.out.println("W is " + w);
		
		z>>=w;
		
		System.out.println("Z is " + z);
		
	
		
	
	}

}

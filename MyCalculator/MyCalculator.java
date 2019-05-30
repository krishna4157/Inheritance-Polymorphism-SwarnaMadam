package MyCalculator;
import java.util.Scanner;
 class MyCalculator implements AdvancedArithmetic {
	 static int count;
	 public static void main(String [] args) {
		 int n;
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the Number :");
		 n=in.nextInt();
		 System.out.println("I implemented: AdvancedArithmetic");
		 AdvancedArithmetic.divisor_sum(n);
		 //System.out.println(count);
	 }

 }

	

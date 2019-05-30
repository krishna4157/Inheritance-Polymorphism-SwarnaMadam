package Artm;
import java.util.Scanner;
class Artm{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		int b;
		Arthemetic am=new Arthemetic();
		Adder add = new Adder();
		Class cls;
		cls=am.getClass();
		System.out.println("Enter the Two Digits :");
		a=in.nextInt();
		b=in.nextInt();
		System.out.println("My superclass is: "+am.getClass().getSimpleName());
		Adder ad= new Adder();
		ad.print(a, b);
		
	}
}

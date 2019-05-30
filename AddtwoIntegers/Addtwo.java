package AddtwoIntegers;
import java.util.Scanner;
class Addtwo{
	public static void main(String args[]) {
		int a,b,c;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first Integer");
		a=in.nextInt();
		System.out.println("Enter second Integer");
		b=in.nextInt();
		in.close();
		/*
		System.out.println("Adding of two numbers is");
		c=a+b;
		System.out.println(c);*/
		Add1.ad(a, b);
	
	}
}

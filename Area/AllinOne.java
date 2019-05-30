package Area;
import java.util.Scanner;
class AllinOne {
	public static void main(String [] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the radius of circle :");
		float r= in.nextFloat();
        System.out.println("Area of Circle is: "+AreaOfCircle1.AreaofCircle1(r));
        System.out.println("Enter the length of rectangle:");
        float l= in.nextFloat();
        System.out.println("Enter the breadth of rectangle:");
        float b= in.nextFloat();
        System.out.println("Area of rectangle is: "+AreaOfrect.AreaOfrect(l,b));
        System.out.println("Enter the length of Square:");
        float s= in.nextFloat();
        System.out.println("Area of square is: "+Areasq.Areasq(s));
        System.out.println("Enter the radius of Sphere :");
        float r1= in.nextFloat();
        System.out.println("Area of Sphere is: "+Areasphere.Areasphere(r1));
	}
}

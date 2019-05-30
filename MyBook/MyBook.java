package MyBook;
import java.util.Scanner;
class MyBook extends Book{
		void setTitle(String s){
			title=s;
		}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Name :");
		String s=in.next();
		MyBook sl =new MyBook();
		sl.setTitle(s);
		System.out.println("The Title of Book is : "+sl.getTitle());
	}
}
package Sstudent;
import java.util.Scanner;
     class Sstudent{
		public static void main(String[] args) {
			System.out.println("Enter the Numbr of Strings 'Student','Rockstar','Hacker'");
			Scanner in =new Scanner(System.in);
			int a= in.nextInt();
			String[] s=new String[a];
				for(int i=0;i<a;i++) {
					s[i]=in.next();	
				}
				for(int i=0;i<a;i++) {
					int count=0;
					if(s[i].contains("Student")) {
						Student st= new Student();
					}
					if(s[i].contains("Rockstar")) {
						Rockstar rs= new Rockstar();
					}
					if(s[i].contains("Hacker")) {
						Hacker hk= new Hacker();
					}
				}
				System.out.println(Student.count+" "+Rockstar.count+" "+Hacker.count);
			}
     }

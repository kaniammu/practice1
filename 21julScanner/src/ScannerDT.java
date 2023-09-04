import java.util.Scanner;

public class ScannerDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name = ");
		String name = scan.nextLine();
		
		System.out.println("Enter your age = ");
		int age = scan.nextInt();
		
		System.out.println("Enter your gender = ");
		char gender = scan.next().charAt(0);
		
		System.out.println("Enter your salary = ");
		double salary = scan.nextDouble();

		System.out.println("your name = " + name);
		System.out.println("your age = " + age);
		System.out.println("your gender = " + gender);
		System.out.println("your salary = " + salary);
		scan.close();
		}

}

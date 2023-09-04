import java.util.Scanner;

public class Inputfromuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter your name = ");
			String name = scan.next();
			System.out.println("your name = " + name);
			scan.close();
		}
}

import java.util.Scanner;

public class NextLine{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name = ");
		String name = scan.nextLine();
		System.out.println("your name = " + name);
		scan.close();


	}

}

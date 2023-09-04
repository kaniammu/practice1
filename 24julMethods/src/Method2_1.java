import java.util.Scanner;

public class Method2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number = ");
        int a = scan.nextInt();
        System.out.println("Enter the second number = ");
        int b = scan.nextInt();
        addNumber(a,b);
        scan.close();
		}
     public static void addNumber(int a, int b) {
		// TODO Auto-generated method stub
    	 int sum = a + b;
    	 System.out.println("The value of add = " + sum);
}
}

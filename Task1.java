import java.util.Scanner;
public class Task1{
	public static void main (String [] args){

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the First Integer: ");
	int num1 = scanner.nextInt();
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the Second Integer: ");
	int num2 = scanner.nextInt();
	
	int num1squared = num1 * num1;
	int num2squared = num2 * num2;
	int sumSquared = num1squared + num2squared;
	int diffSquared = num1squared - num2squared;
	
	System.out.println( num1squared);
	System.out.println( num2squared);
	System.out.println( sumSquared);
	System.out.println( diffSquared);
	
	}
}

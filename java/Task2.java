
import java.util.Scanner;
public class Task2{
	public static void main (String [] args){

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the First Integer: ");
	int num1 = scanner.nextInt();
	System.out.print("Enter the Second Integer: ");
	int num2 = scanner.nextInt();
	System.out.print("Enter the Third Integer: ");
	int num3 = scanner.nextInt();
	
	int average = (num1 + num2 + num3)/3;
	int product = num1 * num2 * num3;
	int largest = 0;
	int smallest = 0;
	
	if (num1 > num2 > num3){num1 = largest && num3 = smallest;
	System.out.println(largest, smallest);}
	else if (num2 > num3 > num1){num2 = largest && = num1 = smallest;
	System.out.println(largest, smallest);}
	else if (num3 > num1 > num2){num3 = largest && num2 = samllest;
	System.out.println(largest, smallest);}
	else if (num3 > num2 > num1){num3 = largest && num1 = smallest
	System.out.println(largest, smallest);}
	else (num2 > num3 > num1){num2 = largest && num1 = smallest
	System.out.println(largest, smallest);}
	
	

	}
}


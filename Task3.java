import java.util.Scanner;
public class Task3{
	public static void main (String [] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Input any Integer: ");
	int number = input.nextInt();
	
	if (number % 3 == 0){System.out.print("Divisible by three");}
	else if (number % 2 != 0){System.out.print("not divisible");}
	
	
	}
}



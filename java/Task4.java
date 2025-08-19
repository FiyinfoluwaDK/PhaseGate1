
import java.util.Scaner;
	public class Task4{
	public static void main(String [] args)	

	Scanner input = new Scanner(System.in);
	System.out.print("Input an integer, positive or negative: ");
	int number = input.nextInt();
		
	if (number > 0){
	System.out.println("Positive");}
	else if (number < 0){
	System.out.println("Negative");}
	else if (number == 0){
	System.out.println("ZeroInput");}
}
}



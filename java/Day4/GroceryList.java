import java.util.ArrayList;
import java.util.Scanner;
	public class GroceryList{
		public static void main (String [] args){

		ArrayList<String> groceryList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean listMenu = true;
		
		while (listMenu) {
			System.out.println("""
							Grocery List Menu:;
							1. Add item;
							2. Remove item;
							3. Show items;
							4. Exit;
							Choose an option (1-4): """);
		
		int choice = scanner.nextInt();
		scanner.nextLine();

		switch (choice){
			case 1:
				System.out.println("Item to Add:  ");
				String itemToAdd = scanner.nextLine();
				groceryList.add(itemToAdd);
				System.out.println(itemToAdd + " was added to list");
				break;
			case 2:
				System.out.println("Item to Remove: ");
				String itemToRemove = scanner.nextLine();
				if (groceryList.remove(itemToRemove))
					{System.out.println(itemToRemove + " is removed from the list");}
				else 
					{System.out.println(itemToRemove + " is not found in the list");}
				break;
			case 3:
				if (groceryList.isEmpty())
					{System.out.println("This list is empty");}
				else
					{for(int count = 0; count < groceryList.size(); count++)
					{System.out.println((count + 1) + "." + groceryList.get(count));}}
					break;
			case 4:
				listMenu = false;
				System.out.print("Exiting Grocery App. . . .");
				break;
			default:
				System.out.println("Invalid option. Please choose between 1 and 4.");
			}
		}
	}
}
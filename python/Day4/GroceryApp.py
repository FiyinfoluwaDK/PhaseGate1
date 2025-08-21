def groceryListApp():
	groceryList = []
	listMenu = True

	while listMenu:
		print("""
Grocery List Menu:
1. Add item
2. Remove item
3. Show items
4. Exit
Choose an option (1-4): """)
		
		
			choice = int(input())
		except ValueError:
			print("Invalid input. Please enter a number between 1 and 4.")
			continue

		if choice == 1:
			itemToAdd = input("Item to Add: ")
			groceryList.append(itemToAdd)
			print(f"{itemToAdd} was added to the list.")
        
		elif choice == 2:
			itemToRemove = input("Item to Remove: ")
			if itemToRemove in groceryList:
				groceryList.remove(itemToRemove)
			print(f"{itemToRemove} is removed from the list.")
			else:
				print(f"{itemToRemove} is not found in the list.")
		
		elif choice == 3:
			if not groceryList:
				print("The list is empty.")
			else:
				for count, item in enumerate(groceryList, start=1):
					print(f"{count}. {item}")
		
		elif choice == 4:
			listMenu = False
			print("Exiting Grocery App...")
        
		else:
			print("Invalid option. Please choose between 1 and 4.")


groceryListApp()
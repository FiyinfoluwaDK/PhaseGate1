def display_likes(names):
    count = len(names)

    if count == 0:
        return "No one likes this"
    elif count == 1:
        return f"{names[0]} likes this"
    elif count == 2:
        return f"{names[0]} and {names[1]} like this"
    elif count == 3:
        return f"{names[0]}, {names[1]} and {names[2]} like this"
    else:
        return f"{names[0]}, {names[1]} and {count - 2} others like this"


print(display_likes([]))  
print(display_likes(["Peter"]))  
print(display_likes(["Jacob", "Mark"]))  
print(display_likes(["Max", "John", "Mark"]))  
print(display_likes(["Alex", "Jacob", "Mark", "Max"])) 

import java.util.List;

public class Task3 {

	public static String displayLikes(List<String> names) {
		int count = names.size();

	switch (count) {
		case 0:
			return "No one likes this";
		case 1:
			return names.get(0) + " likes this";
		case 2:
			return names.get(0) + " and " + names.get(1) + " like this";
		case 3:
			return names.get(0) + ", " + names.get(1) + " and " + names.get(2) + " like this";
		default:
			return names.get(0) + ", " + names.get(1) + " and " + (count - 2) + " others like this";
		}
	}

	public static void main(String[] args) {
		System.out.println(displayLikes(List.of())); 
		System.out.println(displayLikes(List.of("Peter"))); 
		System.out.println(displayLikes(List.of("Jacob", "Mark"))); 
		System.out.println(displayLikes(List.of("Max", "John", "Mark"))); 
		System.out.println(displayLikes(List.of("Max", "Jacob", "Mark", "Alex"))); 
	}
}
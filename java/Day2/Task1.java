public class Task1 {
	
	public static String yearsUntilDoubleAge(int fatherAge, int sonAge) {
	int years = 0;
	while ((fatherAge + years) != 2 * (sonAge + years)) {
		years++;
		if (years > 100) {
			return "It will never happen within a reasonable time.";}
        }
	return String.valueOf(years);
    }

    public static void main(String[] args) {
        System.out.println(yearsUntilDoubleAge(27, 7)); 
        
    }
}
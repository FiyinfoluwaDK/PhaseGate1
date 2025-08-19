public class Task2 {

	public static String totalGrade(int subjectA, int subjectB, int subjectC) {
		double meanScore = (subjectA + subjectB + subjectC) / 3.0;

		if (meanScore >= 90 && meanScore <= 100) {
			return "A";} 
		else if (meanScore >= 80 && meanScore < 90) {
			return "B";} 
           else if (meanScore >= 70 && meanScore < 80) {
			return "C";} 
		else if (meanScore >= 60 && meanScore < 70) {
			return "D";} 
		else if (meanScore >= 0 && meanScore < 60) {
			return "F";} 
		else {return "Invalid score";}
	}

	public static void main(String[] args) {
		System.out.println(totalGrade(77, 87, 99));}
}
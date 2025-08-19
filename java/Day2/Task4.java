public class Task4 {

	public static String fuelChecker(int gallon) {
			int distanceCanBeCovered = gallon * 25;
			int fillingStationDistance = 50;

	if (distanceCanBeCovered == fillingStationDistance){
		return "True"}
	else if (distanceCanBeCovered != fillingStationDistance){
		return "False"}
	}

	public static void main(String[] args) {
		System.out.println(fuelChecker(2));}
}

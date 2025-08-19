function fuelChecker(gallon){
	let distanceCanBeCovered = gallon * 25;
	let fillingStationDistance = 50;
	
	if (distanceCanBeCovered == fillingStationDistance){
		return "True"}
	else if (distanceCanBeCovered != fillingStationDistance){
		return "False"}
}

console.log(fuelChecker(2));
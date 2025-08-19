def fuelChecker(gallon):
        distanceCanBeCovered = gallon * 25;
        fillingStationDistance = 50;

        if (distanceCanBeCovered == fillingStationDistance):
        	return "True"
        elif (distanceCanBeCovered != fillingStationDistance):
                return "False"

print(fuelChecker(2))

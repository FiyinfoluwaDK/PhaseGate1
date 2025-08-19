def yearsUntilDoubleAge(fatherAge, sonAge):
	years = 0
	while (fatherAge + years != 2 * (sonAge + years)):
		years = years + 1
		if (years > 100):
			return "It will never happen within a reasonable time."
	return years

print(yearsUntilDoubleAge(27, 7))

def totalGrade(subjectA, subjectB, subjectC):
    meanScore = (subjectA + subjectB + subjectC) / 3

    if 90 <= meanScore <= 100:
        return "A"
    elif 80 <= meanScore < 90:
        return "B"
    elif 70 <= meanScore < 80:
        return "C"
    elif 60 <= meanScore < 70:
        return "D"
    elif 0 <= meanScore < 60:
        return "F"
    else:
        return "Invalid score"

print(totalGrade(77, 87, 99))  

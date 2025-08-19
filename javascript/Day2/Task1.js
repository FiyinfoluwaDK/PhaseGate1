function yearsUntilDoubleAge(fatherAge, sonAge) {
    let years = 0;

    while (fatherAge + years !== 2 * (sonAge + years)) {
        years++;
        if (years > 100) {
            return "It will never happen within a reasonable time.";}
    }
    return years;}
console.log(yearsUntilDoubleAge(27, 7))
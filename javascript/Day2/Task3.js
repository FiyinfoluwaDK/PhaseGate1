function displayLikes(names) {
    const count = names.length;

	if (count === 0) {
		return "No one likes this";} 
	else if (count === 1) {
		return `${names[0]} likes this`;} 
	else if (count === 2) {
		return `${names[0]} and ${names[1]} like this`;} 
	else if (count === 3) {
		return `${names[0]}, ${names[1]} and ${names[2]} like this`;} 
	else {
		return `${names[0]}, ${names[1]} and ${count - 2} others like this`;}
}

console.log(displayLikes([])); 
console.log(displayLikes(["Peter"])); 
console.log(displayLikes(["Jacob", "Mark"])); 
console.log(displayLikes(["Max", "John", "Mark"])); 
console.log(displayLikes(["Max", "Jacob", "Mark", "Alex"])); 	
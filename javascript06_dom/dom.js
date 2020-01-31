var users = [
{
	name: "Michael", 
	age:37
}, 
{
	name: "John", 
	age:30
}, 
{
	name: "David", 
	age:27
}];

for(user in users) {
	console.log(`${users[user].name} - ${users[user].age}`);
}

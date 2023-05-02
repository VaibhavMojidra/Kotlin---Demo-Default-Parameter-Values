fun printInfo(name: String, age: Int = 25, city: String = "Unknown") {
	println("Name: $name")
	println("Age: $age")
	println("City: $city")
}

fun main(args: Array<String>) {
	printInfo("John")
	printInfo("Emily", 30)
	printInfo("Peter", city = "Boston")
}
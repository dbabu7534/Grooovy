//9. Write a program to convert Fahrenheit into Celsius.

Scanner scanner = new Scanner(System.in)

double fahrenheit = scanner.nextDouble()
double celsius = (fahrenheit - 32) * (5 / 9)

println "Temperature in Celsius: $celsius °C"

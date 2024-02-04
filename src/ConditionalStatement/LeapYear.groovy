//5. Write a Groovy program to check whether a year is leap year or not

boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}

Scanner scanner = new Scanner(System.in)

print("Enter a year: ")
int year = scanner.nextInt()

if (isLeapYear(year)) {
    println("$year is a leap year.")
} else {
    println("$year is not a leap year.")
}

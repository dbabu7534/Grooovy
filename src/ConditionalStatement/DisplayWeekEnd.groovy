//7. Write a Groovy program to uses the weekday number to display the weekday name

String getWeekdayName(int weekdayNumber) {
    switch (weekdayNumber) {
        case 1:
            return "Sunday"
        case 2:
            return "Monday"
        case 3:
            return "Tuesday"
        case 4:
            return "Wednesday"
        case 5:
            return "Thursday"
        case 6:
            return "Friday"
        case 7:
            return "Saturday"
        default:
            return "Invalid weekday number"
    }
}

Scanner scanner = new Scanner(System.in)

print("Enter a weekday number (1-7): ")
int weekdayNumber = scanner.nextInt()

println("The weekday with number $weekdayNumber is ${getWeekdayName(weekdayNumber)}.")

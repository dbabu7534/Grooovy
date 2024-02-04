//8. Write a Groovy program to create Simple Calculator using switch case.
double performOperation(double num1, double num2, char operator) {
    switch (operator) {
        case '+':
            return num1 + num2
        case '-':
            return num1 - num2
        case '*':
            return num1 * num2
        case '/':
            return num1 / num2
        default:
            return Double.NaN // NaN represents an undefined or unrepresentable value
    }
}

Scanner scanner = new Scanner(System.in)

print("Enter the first number: ")
double num1 = scanner.nextDouble()

print("Enter the operator (+, -, *, /): ")
char operator = scanner.next()[0]

print("Enter the second number: ")
double num2 = scanner.nextDouble()


double result = performOperation(num1, num2, operator)
println("Result: $num1 $operator $num2 = $result")



2. Write a program to check whether a number is divisible by 5 and 11 or not


5. Write a Groovy program to check whether a year is leap year or not
6. Write a Groovy program to set the angle in Integer and find its shape
7. Write a Groovy program to uses the weekday number to display the weekday
name


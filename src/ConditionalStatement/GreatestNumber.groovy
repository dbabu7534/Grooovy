//4. Write a Groovy program to Take two int values and print greatest among them.
int findGreatest(int num1, int num2) {
    return Math.max(num1, num2)
}

Scanner scanner = new Scanner(System.in)

print("Enter the first integer: ")
int firstNumber = scanner.nextInt()

print("Enter the second integer: ")
int secondNumber = scanner.nextInt()

int greatest = findGreatest(firstNumber, secondNumber)

println("The greatest among $firstNumber and $secondNumber is: $greatest")

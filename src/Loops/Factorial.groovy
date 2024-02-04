//5. Write a program to find the factorial value of any number.

def findFactorial(number) {
    if (number < 0) {
        return "Please Give Greater Than 1"
    } else if (number == 0 || number == 1) {
        return 1
    } else {
        return number * findFactorial(number - 1)
    }
}


Scanner sc = new Scanner(System.in);


def userInput = sc.nextInt()
def result = findFactorial(userInput)
println("Factorial of $userInput: $result")

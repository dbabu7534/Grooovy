/* 4. Write a program that prompts the set an integer and then outputs the number
with the digits reversed. For example, if the input is 12345, the output should be
54321. */

Scanner input = new Scanner(System.in)
print("Please Enter The Number: ")

def userInput = input.nextInt()

def reverseDigits = 0
def originalNumber = userInput

while (originalNumber != 0) {
    reverseDigits = (reverseDigits * 10) + (originalNumber % 10)
    originalNumber = Math.abs(originalNumber / 10)
    println("Original Number $originalNumber -> $reverseDigits")
}

println("Original number: $userInput")
println("Reversed number: $reverseDigits")

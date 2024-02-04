//6. Write a program to count the number of characters in string using incremental

Scanner sc = new Scanner(System.in)
String inputString = sc.nextLine()

int charCount = 0

for (c in inputString) {
    charCount++
}

println("Your String : $inputString")
println("Number of characters in Your String  : $charCount")

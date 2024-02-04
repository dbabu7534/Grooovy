//3. Write a program print the multiplication table of that number.
Scanner input = new Scanner(System.in)
print("Please Enter The Multiplication Number : ")

def number = input.nextInt()  // Change this to the desired number

println("Multiplication table of $number:")

//for (int i = 1; i <= 10; i++) {
(1..10).each {i ->
    println("$number x $i = ${number * i}")
}

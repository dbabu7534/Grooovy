//1. Write a Groovy program to check whether an integer is positive or negative.
Scanner gt = new Scanner(System.in)
println("Enter the inputs")
def a = gt.nextInt()
if (a % 5 == 0 && a % 11 == 0) {
    print("divisible by 11 and 5")
} else {
    print("Not Divisible")
}

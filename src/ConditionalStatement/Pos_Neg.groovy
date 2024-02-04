//1. Write a Groovy program to check whether an integer is positive or negative.

Scanner gt = new Scanner(System.in)
println("Enter the inputs")
def a = gt.nextInt()
if (a >= 0)
    print("positive number")
else
    print("negative number")


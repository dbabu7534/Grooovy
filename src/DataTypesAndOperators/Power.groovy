// Write a program to print the power of 7 raised to 5.

int calculatePower(base, exponent) {
    int result = 1
    for (i in 1..exponent) {
        result *= base
    }
    return result
}

int base = 7
int exponent = 5
int result = calculatePower(base, exponent)

println("$base raised to the power of $exponent is: $result")
/* 7. Write a program for Increment ++ and Decrement -- Operator as Prefix and
Postfix */

int number = 5

// Prefix increment
int prefixIncrement = ++number

// Prefix decrement
int prefixDecrement = --number

// Postfix increment
int postfixIncrement = number++

// Postfix decrement
int postfixDecrement = number--


println("Prefix Decrement: $prefixDecrement")
println("After Prefix Decrement: $number")
println("Postfix Increment: $postfixIncrement")
println("After Postfix Increment: $number")
println("Postfix Decrement: $postfixDecrement")
println("After Postfix Decrement: $number")

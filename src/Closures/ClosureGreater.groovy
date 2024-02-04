/* 1. Write a program to display the next number that is greater than 2 in the list using
closure (single value) */


ArrayList<Integer> numbers = [1, 2, 3, 4, 5]

// Closure to find the next number greater than 2
ArrayList<Integer> nextNumberClosure = { list ->
    list.find { it > 2 } + 1
}

println "Next number greater than 2: ${nextNumberClosure(numbers)}"

/* 3. Write a program to display the same number multiplication in the list using
closure */
Range:
ArrayList<Integer> numbers = [1, 2, 3, 4, 5]

Closure<List<Integer>> multiplyClosure = { list ->
    list.collect { it * it }
}

println "Numbers multiplied by themselves: ${multiplyClosure(numbers)}"


//2. Write a program to display the numbers that is greater than 2 in the list using
//closure (more than one)

ArrayList<Integer> numbers = [1, 2, 3, 4, 5]


Closure<List<Integer>> greaterThanTwoClosure = { ArrayList<Integer> list ->
    list.findAll { it > 2 }
}

println "Numbers greater than 2: ${greaterThanTwoClosure(numbers)}"

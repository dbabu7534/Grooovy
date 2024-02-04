//2. Write a groovy program to get the first index of the list without using indexnumber.

ArrayList<Integer> numbers = [10, 20, 30, 40, 50]


int firstIndex = numbers.indexOf { 0 }

println "First index of the list: $firstIndex"

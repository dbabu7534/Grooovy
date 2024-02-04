//2. Write a Groovy program to multiply the items in a list.
ArrayList<Integer> numbers = [1, 2, 3, 4, 5]
int product = numbers.inject(1) { acc, num -> acc * num }
println("Product of the numbers in the list: $product")
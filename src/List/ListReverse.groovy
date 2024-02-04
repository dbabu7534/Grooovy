//10. Write a Groovy program to reverse elements in an array list.
ArrayList<String> originalList = ['orange', 'purple', 'pink']

ArrayList<String> reversedList = [*originalList].reverse()

println("Original list: $originalList")
println("Reversed copy: $reversedList")

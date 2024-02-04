//6. Write a Groovy program to calculate the difference between the two lists.
ArrayList<Integer> list1 = [1, 2, 3, 4, 5]
ArrayList<Integer> list2 = [4, 5, 6, 7, 8]
ArrayList<Integer> difference = list1.minus(list2)
println("Difference between two lists: $difference")
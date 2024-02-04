//1. Write a groovy program to display the specific index of the list


ArrayList<Integer> numbers = [10, 20, 30, 40, 50]
int indexToDisplay = 2

if (indexToDisplay in 0..<(numbers.size())) {
    println "Element at index $indexToDisplay: ${numbers[indexToDisplay]}"
} else {
    println "Index $indexToDisplay is out of range."
}

//1. Write a program to print numbers from 1 to 10.

println "Method 1"
for (int i = 1; i <= 10; i++) {
    println(i)
}

println "Method 2"

(1..10).each { println(it) }
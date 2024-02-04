/* 11. If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of
        100), write a program to calculate his total marks and percentage. */

ArrayList<Integer> marks = [78, 45, 62]

Integer totalMarks = marks.sum()
int percentage = (totalMarks / (marks.size() * 100)) * 100

println "Total Marks: $totalMarks"
println "Percentage: $percentage%"

/* 10. A school has following rules for grading system:
        a. Below 25 - F
        b. 25 to 45 - E
        c. 45 to 50 - D
        d. 50 to 60 - C
        e. 60 to 80 - B
        f. Above 80 - A
write a Groovy program to set a marks and print the corresponding grade. */

static char determineGrade(int marks) {
    switch (marks) {
        case 0..24: return 'F'
        case 25..44: return 'E'
        case 45..49: return 'D'
        case 50..59: return 'C'
        case 60..79: return 'B'
        case 80..100: return 'A'
        default: return 'I'
    }
}

Scanner scanner = new Scanner(System.in)

print("Enter the marks: ")
int studentMarks = scanner.nextInt()

char grade = determineGrade(studentMarks)

println("The grade for $studentMarks marks is: $grade")

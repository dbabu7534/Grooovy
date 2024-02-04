//6. Write a Groovy program to set the angle in Integer and find its shape
String identifyShape(int angle) {
    if (angle > 0 && angle < 90) {
        return "Acute Angle"
    } else if (angle == 90) {
        return "Right Angle"
    } else if (angle > 90 && angle < 180) {
        return "Obtuse Angle"
    } else if (angle == 180) {
        return "Straight Angle"
    } else {
        return "Invalid Angle"
    }
}

Scanner scanner = new Scanner(System.in)

print("Enter an angle (0-180 degrees): ")
int angle = scanner.nextInt()

println("The angle $angle degrees is a ${identifyShape(angle)}.")

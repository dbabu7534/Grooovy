//9. Write a Groovy program to check whether a character is VOWEL or CONSONANT
Scanner scanner = new Scanner(System.in)

print("Enter a character: ")
char character = scanner.next().charAt(0)

String checkVowelConsonant(char ch) {
    def result = switch (ch.toLowerCase()) {
        case 'a', 'e', 'i', 'o', 'u' -> "Vowel"
        default -> "Consonant"
    }
    return result
}

println("The character '$character' is a ${checkVowelConsonant(character)}.")

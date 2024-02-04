
//8. Take input of some length in meter and covert it to feet and inches.

Scanner scanner = new Scanner(System.in)


double lengthInMeters = scanner.nextDouble()

double totalInches = lengthInMeters * 39.37
double feet = (totalInches / 12).toInteger()
double inches = (totalInches % 12).toInteger()

println "Length in feet and inches: $feet feet $inches inches"

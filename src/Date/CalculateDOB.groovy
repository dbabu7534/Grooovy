//3. Write a groovy program to calculate your age using DOB

import java.text.SimpleDateFormat
import java.util.Calendar

String name = "Dinesh Babu"
Date dob = new SimpleDateFormat("yyyy-MM-dd").parse("2001-06-06")
Date currentDate = Calendar.getInstance().time
Calendar age = Calendar.getInstance()
age.timeInMillis = currentDate.time - dob.time

println("$name your's age: ${age.get(Calendar.YEAR) - 1970} years")

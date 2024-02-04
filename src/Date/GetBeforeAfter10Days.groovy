//4. Write a groovy program to get the dates 10 days before and after today
import java.text.SimpleDateFormat
import java.util.Calendar

def currentDate = Calendar.getInstance()
def dateFormat = new SimpleDateFormat("yyyy-MM-dd")

currentDate.add(Calendar.DATE, -10)
println("Date 10 days before today: ${dateFormat.format(currentDate.time)}")

currentDate = Calendar.getInstance()
currentDate.add(Calendar.DATE, 10)
println("Date 10 days after today: ${dateFormat.format(currentDate.time)}")

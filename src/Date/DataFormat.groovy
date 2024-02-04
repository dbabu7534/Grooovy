//6. Write a groovy program to change the format of the date
import java.text.SimpleDateFormat
import java.util.Date

def currentDate = new Date()
def currentFormat = new SimpleDateFormat("yyyy-MM-dd")
def newFormat = new SimpleDateFormat("dd/MM/yyyy")

println("Current Date (Original Format): ${currentFormat.format(currentDate)}")
println("Current Date (New Format): ${newFormat.format(currentDate)}")

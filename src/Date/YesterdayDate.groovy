//2. Write a groovy program to display the yesterday date
import java.text.SimpleDateFormat

def currentDate = Calendar.getInstance()
currentDate.add(Calendar.DATE, -1)
def dateFormat = new SimpleDateFormat("yyyy-MM-dd")
println("Yesterday's Date: ${dateFormat.format(currentDate.time)}")

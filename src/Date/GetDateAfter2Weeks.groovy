//5. Write a Java program to get a date after 2 weeks
import java.text.SimpleDateFormat
import java.util.Calendar

def calendar = Calendar.getInstance()
def dateFormat = new SimpleDateFormat("yyyy-MM-dd")


calendar.add(Calendar.DATE, 14)
println "Date after 2 weeks: ${dateFormat.format(calendar.time)}"

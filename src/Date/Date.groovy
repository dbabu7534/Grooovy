//1. Write a groovy program to display the current date
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

def currentDateTime = LocalDateTime.now()
def dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

println("Current Date: ${currentDateTime.format(dateFormat)}")

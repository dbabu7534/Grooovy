//1. Write a Groovy program to associate the specified value with the specified key in a Map.

Map<String, String> myMap = ['Dinesh': 'APK']

String specifiedKey = 'Dinesh'
String value = myMap[specifiedKey]
println("Value for key '$specifiedKey': $value")

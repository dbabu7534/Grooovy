//3. Write a Java program to search for a key in a Map is available or not.

Map<String, String> myMap = ['Dinesh': 'APK']
String searchKey = 'Dinesh'

if (myMap.containsKey(searchKey)) {
    println("Key '$searchKey' is available in the map.")
} else {
    println("Key '$searchKey' is not available in the map.")
}

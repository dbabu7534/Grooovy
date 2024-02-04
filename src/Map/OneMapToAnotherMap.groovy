//5. Write a Groovy program to copy all mappings from the specified map to anothermap

Map<String, String> sourceMap = ['Dinesh': 'APK', 'Babu': 'MDU']
Map<String, String> destinationMap = [:]

destinationMap.putAll(sourceMap)
println("Destination map after copying: $destinationMap")

//7. Write a program to add the two map into a single map

Map<String, String> map1 = ['Dinesh' : 'APK']
Map<String, String> map2 = ['Babu' : 'MDU']

Map<String, String> singleMap = map1 + map2
println("Combined map: $singleMap")

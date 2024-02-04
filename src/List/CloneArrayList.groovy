//9. Write a Groovy program to copy one array list into another.

ArrayList<String> colorList = ['orange', 'purple', 'pink']

def copiedList = colorList.clone()
println("Copied list: $copiedList")

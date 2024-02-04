import groovy.transform.Field

def details = [name: "Dinesh", age: 21, city: "Madurai"]

//println details

//println details.city

//println details['name']
//
//println details.get('city')

details.put('city', 'APK')

//println details

details?.each { key, value ->
    println "$key :: $value"
}
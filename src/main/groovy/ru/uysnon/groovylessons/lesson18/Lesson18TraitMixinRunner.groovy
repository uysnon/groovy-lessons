package ru.uysnon.groovylessons.lesson18

import groovy.transform.ToString

trait WithId {
    int id
    void printId() {
        println id
    }
}

@ToString
class Cat implements WithId {
    String name
    int weight
}

Cat cat = new Cat(name: "Kitty", weight: 10, id: 5)
assert cat.id == 5
assert cat.name == "Kitty"
cat.printId()

class MyStingUtils {
    static void printStringWithSign(String self, char sign) {
        println "$self: $sign"
    }
}

String.class.mixin(MyStingUtils.class)
def name = 'Karasik'
name.printStringWithSign('%' as char)




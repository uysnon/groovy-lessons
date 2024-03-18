package ru.uysnon.groovylessons.lesson11

int x = 5

switch (x) {
    case 1 -> println "1"
    case [1, 4, 6] ->
        print "2"
    case String -> { // x.class.isInstance(String.class)
        print "3"
        println "anything here"
    }
    case (new AnyClass()) -> // по умолчанию вызывается метод boolean isCase()
        print "4"
    case ~/\d+/ -> // вызывается метод toString() у x, после чего применяется регулярка
        print "5"
    default ->
        print "6"

}

if (x in [12, 124, 5]) { // вызов метода isCase()
    println "x in list"
}

class AnyClass {
    boolean isCase(Object object) {
        println "inCaseObject: $object"
        return object === 5
    }
}


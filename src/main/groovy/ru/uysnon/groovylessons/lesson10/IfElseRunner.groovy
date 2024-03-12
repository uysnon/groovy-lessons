package ru.uysnon.groovylessons.lesson10

// boolean is true
// Collection, Map is not empty
// String, GString is not empty
// Number/Char != 0
// reference != null
if (List.of()) {

}

def petr1 = new Petr("Netr2")
def petr2 = new Petr("Petr2")
if (petr1) println petr1 // false - not print
if (petr2) println petr2 // true - print

class Petr {
    String name

    Petr(String name) {
        this.name = name
    }

    boolean asBoolean() {
        return name.startsWith("Pe")
    }

    @Override
    public String toString() {
        return "Petr{" +
                "name='" + name + '\'' +
                '}';
    }
}

Petr p = null
p?.getName() // if (p != null) p.getName()

String n = null
String a =  n ?: "hi" // String a = (n != null) ? n : "hi"

print a


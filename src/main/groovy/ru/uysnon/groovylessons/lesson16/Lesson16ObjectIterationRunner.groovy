package ru.uysnon.groovylessons.lesson16

def list = [1, 2, 4, 5, 6]
assert list.any { it % 2 == 0 }
assert list.find { it % 2 == 0 } == 2
assert list.findAll { it % 2 == 0 } == [2, 4, 6]
assert (2..4).collect() == [2, 3, 4]

class Cat {
    String name

    Cat(String name) {
        this.name = name
    }
}

def cat = new Cat("Murka")
cat.each { println it }

// grep == isCase method call (также как в in, switch)
assert ["m2a", "mua", "3ff", "22"].grep(~/.*\d+.*/) == ["m2a", "3ff", "22"]
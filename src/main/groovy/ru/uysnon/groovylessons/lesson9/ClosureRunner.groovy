package ru.uysnon.groovylessons.lesson9


Closure closure1 = (a, b) -> println(a + b)
Closure closure2 = { a, b -> println a + b }

closure1.call(1, 5)
closure2(2, 2)

Closure closure = { println(++it) }
closure(9)


int x = 5
Closure myClosure = { x++ }
myClosure()
myClosure()

print x
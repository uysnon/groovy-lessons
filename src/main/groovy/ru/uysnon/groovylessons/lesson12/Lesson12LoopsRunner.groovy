package ru.uysnon.groovylessons.lesson12

def list = [1, 3, 5, 6]
// java
for (int i = 0; i < list.size(); i++) {
    println "$i : ${list[i]}"
}
println "---"

// groovy
for (i in 0..<list.size()) {
    println "$i : ${list[i]}"
}
println "---"

// java
for (int value: list) {
    println value
}
println "---"

// groovy
for (value in list) {
    println value
}
println "---"

// далее все groovy варианты из утилитного класса org.codehaus.groovy.runtime.DefaultGroovyMethods
0.upto(list.size() - 1) {
    println "$it : ${list[it]}"
}
println "---"

(list.size() - 1).downto(0) {
    println "$it : ${list[it]}"
}
println "---"

list.size().times {
    println "$it : ${list[it]}"
}
println "---"


0.step(list.size(), 2) {
    println "$it : ${list[it]}"
}
println "---"





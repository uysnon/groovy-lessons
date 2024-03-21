package ru.uysnon.groovylessons.lesson17

import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@TupleConstructor
class Person {
    String firstName
    String lastName
    Integer age

    def getAt(int position) {
        position == 0 ? firstName : lastName
    }
}

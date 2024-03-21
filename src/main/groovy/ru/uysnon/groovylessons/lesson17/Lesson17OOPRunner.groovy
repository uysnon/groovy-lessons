package ru.uysnon.groovylessons.lesson17

class Lesson17OOPRunner {
    static void main(String[] args) {
        Person person = new Person()
        person.firstName = 'Dima'
        person['lastName'] = 'Dimov'
        person.'age' = 20
        println person
        println person.age
        println person.@age

        Person person1 = new Person(firstName: "Kolya", age: 34) // default constructor + setters
        assert person1.getFirstName() == "Kolya"
        assert person1.age == 34

        Person person2 = new Person("Anna", "Petrovna", 28) // constructor with arguments

        def fn, ln
        (fn, ln) = person2
        assert fn == "Anna"
        assert ln == "Petrovna"

        assert [person1, person2]*.age == [34, 28]
        assert [person1, person2].age == [34, 28]
        assert [person1, person2].collect {it.age} == [34, 28]



    }
}

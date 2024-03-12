package ru.uysnon.groovylessons.lesson8

import java.util.regex.Matcher
import java.util.regex.Pattern

javaRegex()
groovyRegex()


void javaRegex() {
    String string = "One 1 Two 22 Three 333"

    String regex = "(\\w+) (\\d+)"
    Pattern pattern = Pattern.compile(regex)
    Matcher matcher = pattern.matcher(string)

    println matcher.matches()

    while (matcher.find()) {
        println matcher.group()
        println matcher.group(1)
        println matcher.group(2)
    }
}

void groovyRegex() {
    var string =  "One 1 Two 22 Three 333"
    var regex = /(\w+) (\d+)/
    Pattern pattern = ~regex
    Matcher matcher = string =~ regex
    boolean  matches = string ==~ regex
    println matches
    println pattern.matcher(string).matches()
    matcher.each {it ->
        println matcher.group()
        println matcher.group(1)
        println matcher.group(2)
    }

    println matcher[2][1] //Three
}



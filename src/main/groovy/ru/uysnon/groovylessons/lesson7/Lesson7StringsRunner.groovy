package ru.uysnon.groovylessons.lesson7

// 7 способов создавать строки

// можем использовать двойные кавычки внутри без экранирования
// нет поддержки интерполяции
def value1 = '"Hello"'

// поддержка интерполяции, если используем то создается объект типа GString
// Object value2 = new GStringImpl(new Object[]{value1}, new String[]{"show me ", ""});
def value2 = "show me $value1"

// text block, во время компиляции преобразуется в обычную строку с \n
// нет поддержки интерполяции
def value3 = '''Hello $cannotGetItHere
world
'''

// text block
def value4 = """
$value1
world
"""

// можно не экранировать ' и "
def value5 = /'Hello' $value1 "World"/

// можно не экранировать ' " $ - вроде как применяется в регулярных выражениях
def value6 = $/'Hello' $value1 "World"/$

//println "value1: $value1"
//println "value2: $value2"
//println "value3: $value3"
//println "value4: $value4"
//println "value5: $value5"
//println "value6: $value6"

def value = "Candy"
println value[1]
println value * 2
println value - 'an'
println value[0]
println value[-1]
println value[1..-2]




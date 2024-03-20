package ru.uysnon.groovylessons.lesson15

def range1 = 1..10
assert range1.getClass() == IntRange
assert range1.getFrom() == 1
assert range1.getTo() == 10

def range2 = 1<..<10
assert range2.getFrom() == 2
assert range2.getTo() == 9

def range3 = 'a'..<'z'
assert range3.getClass() == ObjectRange
assert range3.getFrom() == 'a'
assert range3.getTo() == 'y'


var range4 = WeekDay.MO<..WeekDay.SU
assert range4.getFrom() == WeekDay.TU
assert range4.getTo() == WeekDay.SU
range4.each {println it}


enum WeekDay {
    MO, TU, WE, TH, FR, SA, SU
}



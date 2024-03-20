package ru.uysnon.groovylessons.lesson14

def emptyMap = [:]
assert emptyMap.getClass() == LinkedHashMap

def one = "notOne" // не будет вызван в след. строке
def map = [one : 1, "two" : 22]

assert map.getClass() == LinkedHashMap
assert map["one"] == 1
assert map.two == 22
assert map.get("one") == 1
assert map.get("owow", 55) == 55

map.one = 11
map.put("three", 3)

assert map.subMap(["two", "three"]) == ["two": 22, "three": 3]

map = ["y": 4, z : 1]
assert ["x": 777, *:map] == ["x": 777, z: 1, y: 4]


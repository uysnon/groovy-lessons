package ru.uysnon.groovylessons.lesson13

def list = [1, 2, 3, 6]
int[] array = [1, 2, 3, 4] // явное создание массива

assert list.getClass() == ArrayList

def list1 = [1, 2, 3, 5, 7]
assert list1[1] == 2
assert list1[-1] == 7
assert list1[1..3] == [2, 3, 5]

list1 += 1
assert list1 == [1, 2, 3, 5, 7, 1]

list1 += [1, 10]
assert list1 == [1, 2, 3, 5, 7, 1, 1, 10]

list1 << 12 << 0
assert list1 == [1, 2, 3, 5, 7, 1, 1, 10, 12, 0]

list1 -= 1
assert list1 == [2, 3, 5, 7, 10, 12, 0]

list1 *= 3
assert list1 == [2, 3, 5, 7, 10, 12, 0, 2, 3, 5, 7, 10, 12, 0, 2, 3, 5, 7, 10, 12, 0]

assert [1, 2, 3].reverse() == [3, 2, 1]
assert [1, 2, 3].intersect([1, 2, 4]) == [1, 2]
assert [1, 2, 2, 3].intersect([1, 2, 2, 4]) == [1, 2, 2]
assert ![1, 2, 2, 3].disjoint([1, 5, 10])
assert [1, 2, 2, 3].disjoint([5, 10])


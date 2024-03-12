package ru.uysnon.groovylessons.lesson6

assert  1  + 2 == 3
assert  4  - 3 == 1
assert  3  * 5 == 15
assert  3  / 2 == 1.5
assert  3.intdiv(2) == 1
assert 10  % 3 == 1
assert  2 ** 3 == 8

Car car = new Car(5);
Mem mem = car as Mem
print mem.fieldOther

class Car {
    int field1;

    Car(int field1) {
        this.field1 = field1
    }

    def asType(Class clazz) {
        if (clazz == Mem) {
            return new Mem(field1.toString() + "-mem");
        }
    }
}

class Mem {
    String fieldOther;

    Mem(String fieldOther) {
        this.fieldOther = fieldOther
    }
}
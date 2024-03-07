package ru.uysnon.groovylessons

import groovy.transform.CompileStatic

import java.util.Date as JavaDate
import java.sql.Date as SqlDate

class Lesson5Runner {
    /*
    8 основных типов данных
    целочисленные byte (1), short (2), int (4), long(8)
    float(4), double (8)
    char (2)
    boolean (4 byte)
     */
    @CompileStatic
    static void main(String[] args) {
        int x = 2
        print x.toString()

        BigInteger i = 4G
        BigDecimal e = 4.5G

        print i.add(4G)

        JavaDate javaDate = new JavaDate()
        def sqlDate = new SqlDate(javaDate.getTime())
    }
}

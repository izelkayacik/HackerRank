package com.izelkayacik.hackerrank

//Listenin toplamını veren hazır fonksiyon -> .sum()

fun main() {
    println(simpleArraySum1(arrayOf(1, 2, 3, 4, 10, 11)))
}

fun simpleArraySum1(ar: Array<Int>): Int = ar.sum()
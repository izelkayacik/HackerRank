package com.izelkayacik.hackerrank

fun main() {
    val result = compareTrilets1(arrayOf(1, 2, 3), arrayOf(2, 1, 4))
    println(result.joinToString(" "))
}

//zip fonksiyonu ile her iki listenin elemanlarını kıyaslayarak istediğimiz koşulu ekleyebiliriz.
fun compareTrilets1(a: Array<Int>, b: Array<Int>): Array<Int> {
    val scoreOfAlice = a.zip(b).count{ it.first > it.second}
    val scoreOfBob = a.zip(b).count{ it.second > it.first}

    return arrayOf(scoreOfAlice, scoreOfBob)
}

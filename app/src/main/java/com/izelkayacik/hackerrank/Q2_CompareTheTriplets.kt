package com.izelkayacik.hackerrank

/*Compare the Triplets
Verilen iki liste için birbirlerine karşılık gelen indexlerin karşılaştırılıp büyük olan için 1
puan kazanılması hedefleniyor..*/

fun main() {
    val result = compareTrilets(arrayOf(1, 2, 3), arrayOf(2, 1, 4))
    println(result.joinToString(" "))
}

fun compareTrilets(a: Array<Int>, b: Array<Int>): Array<Int> {

    var scoreOfAlice = 0
    var scoreOfBob = 0

    for (index in a.indices) {
        when {
            a[index] > b[index] -> {
                scoreOfAlice++
            }
            b[index] > a[index] -> {
                scoreOfBob++
            }
        }
    }

    return arrayOf(scoreOfAlice, scoreOfBob)
}
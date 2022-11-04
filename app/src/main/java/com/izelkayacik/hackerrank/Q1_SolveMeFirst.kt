package com.izelkayacik.hackerrank

/*Simple Array Sum
For example, if the array ar = [1, 2, 3], 1 + 2 + 3 =6, so return 6
Verilen bir dizinin eleman değerlerinin toplamı isteniyor.*/

fun main() {
    println(simpleArraySum(arrayOf(1, 2, 3, 4, 10, 11)))
}

fun simpleArraySum(ar: Array<Int>): Int {
    var sum = 0

    for (element in ar) {
        sum += element
    }

    return sum
}
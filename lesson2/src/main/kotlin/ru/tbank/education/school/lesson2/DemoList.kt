package ru.tbank.education.school.lesson2

import kotlin.random.Random

object DemoList {
    fun createList(): List<Int> {
        return listOf(Random.nextInt(1, 100),
                Random.nextInt(1, 100),
                Random.nextInt(1, 100),
                Random.nextInt(1, 100),
                Random.nextInt(1, 100))
    }

    fun sumList(): Int {
        return createList().sum()
    }

    fun sumEvenList(): Int {
        var ans = 0
        for (el in createList()) {
            if (el % 2 == 0) ans += el
        }
        return ans
    }

    fun multiplyList(): List<Int> {
        return createList().map{it * 2}
    }

    fun maxElement(): Int {
        return createList().max()
    }

    fun sortDesc(): List<Int> {
        return createList().sorted().reversed()
    }
}

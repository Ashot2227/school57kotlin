package ru.tbank.education.school.lesson2

import kotlin.random.Random

object DemoMap {
    fun createMap(): Map<String, Int> {
        return mapOf(Random.nextInt(10000, 1000000000).toString() to Random.nextInt(1, 100),
            Random.nextInt(10000, 1000000000).toString() to Random.nextInt(1, 100),
            Random.nextInt(10000, 1000000000).toString() to Random.nextInt(1, 100),
            Random.nextInt(10000, 1000000000).toString() to Random.nextInt(1, 100),
            Random.nextInt(10000, 1000000000).toString() to Random.nextInt(1, 100))
    }


    fun printMap(): List<String> {
        var ans: MutableList<String> = mutableListOf()
        val local = createMap()
        for (el in local.keys) {
            val loc = local[el]
            ans.add("$el: $loc")
        }
        return ans
    }

    fun maxValue(): Int {
        return createMap().values.max()
    }

    fun keyForMaxValue(): String {
        val local = createMap()
        var mx = local.toList()[0].first
        for (el in local.toList()) {
            if ((local[el.first] ?: 0) > (local[mx] ?: 0)) {
                mx = el.first
            }
        }
        return mx
    }

    fun sortByValueDesc(): Map<String, Int> {
        var local = createMap().toList()
        local = local.sortedBy { it.second }
        local = local.reversed()
        var ans:MutableMap<String, Int> = mutableMapOf()
        for (el in local) {
            ans[el.first] = el.second
        }
        return ans
    }

    fun filterOddValues(): Map<String, Int> {
        var local = createMap().toList()
        local = local.filter{it.second % 2 == 1}
        var ans:MutableMap<String, Int> = mutableMapOf()
        for (el in local) {
            ans[el.first] = el.second
        }
        return ans
    }
}

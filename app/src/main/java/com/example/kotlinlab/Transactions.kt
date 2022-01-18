package com.example.kotlinlab

import java.text.SimpleDateFormat
import java.util.*

class Transactions {

    fun solution(A: Array<Int>, D: Array<String>): Int {
        var fee = 5 * 12

        val paymentsByMonth = mutableMapOf<Int, MutableList<Int>>()
        val sdf = SimpleDateFormat("yyyy-MM-dd")
        val instance = Calendar.getInstance()

        for (K in A.indices) {
            if (A[K] < 0){
                instance.time = sdf.parse(D[K])
                val currentMonth = instance.get(Calendar.MONTH)
                if (paymentsByMonth[currentMonth].isNullOrEmpty()) paymentsByMonth[currentMonth] =
                    mutableListOf()
                paymentsByMonth[currentMonth]?.add(A[K])
            }
        }

        paymentsByMonth.forEach { month ->
            val number = month.value.size
            val total = month.value.sum()

            if (number >= 3 && total <= -100) fee -= 5
        }

        return A.sum() - fee
    }

}
package com.example.kotlinlab

class MaxWordsInASentence {

    fun solution(S: String): Int {
        var maxWordsInASentence = 0
        val sentences = S.split("[.?!]".toRegex())
        sentences.forEach { sentence ->
            val words = sentence.split("\\s".toRegex())
            if (words.size > maxWordsInASentence) maxWordsInASentence = words.size
        }

        return maxWordsInASentence - 1
    }
}
package com.example.kotlinlab

import java.lang.StringBuilder
import java.text.SimpleDateFormat

class Photos {
    fun solution(S: String): String {
        val sb = StringBuilder()
        val photos = S.split("\\n".toRegex())

        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        photos.forEach { photo ->
            val split = photo.split(",")

            val file = split[0].split(".")
            val name = file[0]
            val extension = file[1]

            val city = split[1]
            val date = sdf.parse(split[2])

            sb.append(city)
//            sb.append(count)
            sb.append(".")
            sb.append(extension)
            sb.append("\\n")

        }

        return sb.toString()
    }
}
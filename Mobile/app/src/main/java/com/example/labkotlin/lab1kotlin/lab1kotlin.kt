package com.example.labkotlin.lab1kotlin

import javax.security.auth.Subject

fun main(){
   val subjectScore :Array<Int> = arrayOf(57,77,89,61,75)
    println("There are "+subjectScore.size+ "subjects in array.")

    CalGPAX(subjectScore)
}
fun  CalGPAX(subjectArr: Array<Int>){
    var i: Int = 1
    var grade : String
    var point : Double
    var sum: Double = 0.0
    var gpax: Double = 0.0
    var sumarray :Array<Double> = arrayOf()
    for (value:Int in subjectArr){
        when{
            value <50 -> grade = "F"

            value <55 -> grade = "D"

            value <60 -> grade = "D+"

            value <65 -> grade = "C"

            value <70 -> grade = "C+"

            value <75 -> grade = "B"

            value <80 -> grade = "B+"

            else -> grade = "A"


        }

        when (grade){
            "F" -> point = 0.0
            "D" -> point = 1.0
            "D+" -> point = 1.5
            "C" -> point = 2.0
            "C+" -> point = 2.5
            "B" -> point = 3.0
            "B+" -> point = 3.5
        else    -> point = 4.0


        }

        println(" Grade of Subject  Number $i = $grade = $point")
        i++

        sumarray += point

        sum += point*3
}
    gpax = sum / 15
    print("GPAX = ")
    for (j in sumarray){
        print("(( $j * 3 )) + ")
    }
    println ("/15 = " + gpax)

}


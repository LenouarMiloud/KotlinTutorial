package com.robot.anonyme.datatypemembers

/**
 * Created by ANONYME on 8/12/2019.
 */

/**
* in this file i want to use the defferent of variables with there operation in kotlin
 */

fun main(args: Array<String>) {
// integer variables
    var number1:Int = 22

// Float variable
    var pi:Float = 3.14F // the F notation mean that this number is a float number

// Double variable
    var doubleVar:Double = 2.25

//we use the " ntation with String variables and ' with the character variables

// String variable
    var name:String = "Miloud"

// Character variable
    var letter:Char = 'M'

//Some Operation
    number1.dec()// this function decrement the number by 1
    var comparision = number1.compareTo(46)
    /*
    * this function return:
    * 1 if  first number > the second number
    * 0 if  first number = the second number
    * -1 if first number < the second number*/
    //here we can change to any type toDouble -- toFloat -- toString
    var intToDouble = number1.toDouble()
    //Arithmitic operation
    var sum1 = number1 + pi

    var min1 = number1- pi

    var mul1 = number1 * pi

    var div = number1 / pi

    var rem = number1 % pi // this is the rest of the euclidienne divide



}









package com.robot.anonyme.myapplication

/**
 * Created by ANONYME on 8/13/2019.
 */
fun main(args: Array<String>) {
    //integer variable
    var nbr:Int = 15

    //Double variable
    var rem:Double = 25.3

    //Float variable
    var pi:Float = 3.14F// the F annotation mean that this number is a Float number

    //String variable
    var nom:String = "LENOUAR"

    //Char variable
    var lettre:Char = 'M'

    // arithmitic operation
    var som = nbr + nbr       // the addition operation +
    var mul = nbr * 2         // the multiplication operation *
    var div = nbr / nbr       // the Division Operation /
    var sub = nbr - nbr       // the subtraction operation -
    var remind = nbr % 4      // the operation % returns the rest of the Euclidean division
    var nbrdec = nbr.dec()    // the dec() function decriment the number by 1  nbrdec = nbr - 1
    var com = nbr.compareTo(25) // this function return 1 if the nbr > 25 and 0 if nbr == 25 and -1 if nbr < 25

    var isHere:Boolean = true
    var strlen = nom.length   //this function returns the length of the string
    var strchg = nom.replace('L','l') //this function will change the first parameter by the second


}
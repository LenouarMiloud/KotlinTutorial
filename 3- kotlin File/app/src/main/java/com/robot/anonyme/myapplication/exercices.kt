package com.robot.anonyme.myapplication

/**
 * Created by ANONYME on 8/14/2019.
 */
fun main(args: Array<String>) {
    /**
     * Exercice 1 Solution
     */

    var sum:Int = 0

    for (i in 1 until 11){
        print("Enter the number ${i} : ")
        sum += readLine().toString().toInt()
    }

    print ("The Result is : ${sum}")
}
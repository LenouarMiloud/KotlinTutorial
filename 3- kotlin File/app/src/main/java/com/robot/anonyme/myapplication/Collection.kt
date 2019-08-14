package com.robot.anonyme.myapplication

/**
 * Created by ANONYME on 8/14/2019.
 */

/**
 * make an array of the temperature
 * and calculate his average by 2 defferent Solution
 *
 * in this exercice we know how we can use the Loops
 */

fun main(args: Array<String>) {
    /**
     * First Solution
     */

    //Array Declaration
    var temperature:Array<Byte> = arrayOf(21,22,24,18,19,16,21,22,24,18,19,16,19,16,21,18,19,16)

    //The sum of the array members
    var sum = temperature[0] + temperature[1] + temperature[2] + temperature[3] + temperature[4] + temperature[5]
            + temperature[6] + temperature[7] + temperature[8] + temperature[9] + temperature[10] + temperature[11]
            + temperature[12] + temperature[13] + temperature[14] + temperature[15] + temperature[16] + temperature[17]

    // calculate the average of the array
    var average = sum / 18

    print("The Average of Temperature is : ${average}")

    /**
     * Second Solution
     */

    //Array Declaration is the same

    //The sum of the array members
    var sum1:Int =0
    for (i in temperature) {
        sum1 += i
    }
    /**
     * here we see that the code with the loop is very short because in case of we use
     * an array that contain big number of data
     */


    // calculate the average of the array
    var average1 = sum / temperature.size  // temperature.size will the return the lenght of the array

    print("The Average of Temperature is : ${average1}")

    //this is how we can print any index with his value
    for ((index,value)in temperature.withIndex()) // here we must use the withIndex() function
        print("The element at index ${index} has a value ${value}")



}

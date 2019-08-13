package com.robot.anonyme.myapplication

/**
 * Created by ANONYME on 8/13/2019.
 */

fun main(args: Array<String>) {
    //Function Without parameter
    calculateRectangleArea()
    //Function with Parameters
    calculateRectanglePerimeter(15,5)
    //Function with return value
    val msg = functionReturnValue("Miloud")
    println(msg)
}

fun calculateRectangleArea(){
    var wight :Int = 25
    var height :Int = 2

    val surf = wight * height

    println("The Surface is : $surf ")
}
 fun calculateRectanglePerimeter(width:Int,height:Int){
     val perimetre = (width + height) * 2
     println("The perimeter of the Rectangle is : $perimetre")
 }
 fun functionReturnValue(name:String):String{
     val  helloname = "Hello "+ name
     return helloname
 }

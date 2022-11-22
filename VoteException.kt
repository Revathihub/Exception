package com.Exceptions
import java.lang.Exception
fun main(args:Array<String>){
    try{
        checkelgibility(2)
    }
    catch(e:Exception){
        println(e)
    }

}
fun checkelgibility(age:Int){
    if(age>=18){println("Your eligible for vote")}
    else
        throw Exception("Your are not eligible for vote")
}
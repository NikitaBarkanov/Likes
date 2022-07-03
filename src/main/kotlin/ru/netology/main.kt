package ru.netology

fun main(){

    println("Тут надо ввести предположительное число лайков: ")
    val likes = readLine()
    val likesValue = likes?.toInt()
    println("Число лайков $likes.")

    if(likesValue!=11 && likes?.contains("1")==true)
        println("Нравится $likes человеку.")
    else
        println("Нравится $likes людям.")

}
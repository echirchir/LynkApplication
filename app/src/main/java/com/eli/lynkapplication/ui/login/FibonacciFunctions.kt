package com.eli.lynkapplication.ui.login

var first_list = IntArray(101 )
val second_list: IntArray = intArrayOf(1, 89, 7, 40, 0, 7, 8, 34, 21, 55, 91, 100, 24, 28, 103, 144)
var third_list = IntArray(101)

/*
* 1.
* Fibonacci function
* Generates series of numbers
* prints out the numbers from start to end
* Inserts to a first_list array
*/
fun fibonacci(n: Int){

    var t1 = 0
    var t2 = 1

    println("First $n terms: ")

    first_list[0] = t1
    first_list[1] = 1

    for (i in 2..n) {

        print("$t1 + ")

        val sum = t1 + t2

        t1 = t2
        t2 = sum

        //insert numbers into first_list array
        first_list[i] = sum

    }
}

/*
* 2.
* Uses fibonacci function
* Generates series and saves to first_list
* prints out the numbers from start to end
*/
fun printFirstListOf100(n: Int){

    fibonacci(n)

    for (i in 0..n){

        print(first_list[i].toString() + " ")
    }

}

/*
* List filter function
* Extracts numbers that exist in List 2 but NOT in list 1
* prints out the numbers
*/
fun inSecondListAndNotInFirst(){

    println("Third List------------------")
    for (i in second_list.indices){
        if ( second_list[i] !in first_list){
            print(second_list[i].toString() + " ")
            third_list[i] = second_list[i]
        }
    }
    println()
}

/*
* List of numbers generated using fibonacci
*/
fun printFirstList(){
    println("First List-----------100-------")
    for (i in first_list.indices){
        print(first_list[i].toString() + " ")
    }

    println()
}

/*
*
* Prints out a List of numbers provided in the question
*/
fun printSecondList(){
    println("Second  List----------------")
    for (i in second_list.indices){
        print(second_list[i].toString() + " ")
    }

    println()
}

/*
* Prints out the content of first_list
* Verifies its content
* That the fibonacci function works
*/
fun testFirstList(){
    (first_list.indices).forEach { i ->
        print(first_list[i].toString() + " - ")
    }
    println()

}

/*
* Application main entry in Kotlin
*/
fun main() {

    println(fibonacci(100))
    printFirstListOf100(100)

    testFirstList()

    printFirstList()
    printSecondList()
    inSecondListAndNotInFirst()

}

//OUTPUT FOR TEST CASES
// First 30 terms: 0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 + 144 + 233 + 377 + 610 + 987 + 1597 + 2584 + 4181 + 6765 + 10946 + 17711 +
// 28657 + 46368 + 75025 + 121393 + 196418 + 317811 + 514229
// First 10 terms: 0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34
// First 15 terms: 0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 + 144 + 233 + 377
// First 20 terms: 0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 + 144 + 233 + 377 + 610 + 987 + 1597 + 2584 + 4181

// FIRST LIST
// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269
// 2178309 3524578 5702887 9227465 14930352 24157817 39088169
// 63245986 102334155 165580141 267914296 433494437 701408733 1134903170 1836311903 -1323752223 512559680 -811192543 -298632863 -1109825406
// -1408458269 1776683621 368225352 2144908973 -1781832971 363076002
// -1418756969 -1055680967 1820529360 764848393 -1709589543 -944741150 1640636603 695895453 -1958435240 -1262539787 1073992269 -188547518
// 885444751 696897233 1582341984 -2015728079 -433386095 1845853122
// 1412467027 -1036647147 375819880 -660827267 -285007387 -945834654 -1230842041 2118290601 887448560 -1289228135 -401779575 -1691007710
// -2092787285 511172301 -1581614984 -1070442683 1642909629 572466946
// -2079590721 -1507123775 708252800 -798870975 -90618175 -889489150 -980107325

//SECOND LIST
// 1 89 7 40 0 7 8 34 21 55 91 100 24 28 103 144

// THIRD----------------inSecondListAndNotInFirst()--
// 7 40 7 91 100 24 28 103
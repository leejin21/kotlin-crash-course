fun main(){
    // * if-else문
    // val x = 1
    // if (x==2) {
    //     println("x is 2")
    // } else if (x == 3){
    //     println("x is 3")
    // } else {
    //     println("x is not 2 or 3")
    // }

    // val y = if(x == 2) 2 else 3

    // val number1 = readLine() ?: "0"
        // readline의 결과가 null이면 0임
    // val number2 = readLine() ?: "0"
    // val result = number1.toInt() + number2.toInt()
        // ?: only 실행 when number1 != null일 때
        // !!: trust me it is not null
        // 위 !!방법은 프로그램 크래시하기 쉽기 때문에 권장X.
    // println(result)

    val shopping_list = mutableListOf("food", "milk", "fruit")
    shopping_list.add("Ferrari")
    println(shopping_list[3])

    // * loop
    // (1) while loop
    println("==while loop==")
    var cnt = 0
    while(cnt < shopping_list.size){
        println(shopping_list[cnt])
        cnt++
    }
    println("==for loop 1==")
    for(shoppingItem in shopping_list){
        println(shoppingItem)
    }
    println("==for loop 2==")
    for (i in 1..10){
        println(i)
    }
    // * if else(similar to switch-case)
    println("==when==")
    val x1 = 3
    when(x1) {
        in 1..2 -> println("x1 is between 1 and 2")
        in 3..10-> println("x1 is between 3 and 10")
        else -> {
            println("x1 is not in the range of 1 to 10")
        }
    }
    

    print10Numbers()
}

// * function basic
fun print10Numbers(){
    println("==function==")
    for (i in 1..10){
        println(i)
    }
}

// * function params and return
// get Int type param, return Boolean type data
fun isEven(number: Int): Boolean{
    return number % 2 == 0
}
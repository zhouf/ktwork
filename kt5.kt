package demo

fun main(args: Array<String>) {
    // 这是视频内容练习，function
    val numList = 1..20
    val evenList = numList.filter{it%2==0}
    evenList.forEach{n->println(n)}

    //把函数的返回作为一个方法
    val mult3 = makeMathFunc(3)
    println("5 * 3 = ${mult3(5)}")

    val multiply2 = {num1: Int -> num1 * 2}
    val numList2 = arrayOf(1,2,3,4,5)
    mathOnList(numList2,multiply2)
}


fun makeMathFunc(num1: Int): (Int) -> Int = {num2 -> num1 * num2}

fun mathOnList(numList: Array<Int>, myFun: (num: Int) -> Int){
    for(num in numList){
        println("MathOnList ${myFun(num)}")
    }
}
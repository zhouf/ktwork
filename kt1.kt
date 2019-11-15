package demo

fun main(args: Array<String>) {
    // 这是视频内容练习

    var myArray = arrayOf(1,12.3,"dogs")
    println("myArray.size=${myArray.size}\t contains:${myArray.contains("dogs")}\t first:${myArray.first()}")

    var sqArray = Array(5,{x->x*x})
    println(sqArray[4])

    val oneTo10 = 1..10
    val alpha = 'A'..'Z'
    println(oneTo10 + alpha)
    println("R in range: ${'R' in alpha}")

    val tenTo1 = 10.downTo(1)
    val twoTo20 = 2.rangeTo(20)
    val rng3 = oneTo10.step(3)
    println(tenTo1 + twoTo20)
    for(x in rng3) print("rng3: $x, ")
    for(x in tenTo1.reversed()) print("Reverse: $x ,")
}
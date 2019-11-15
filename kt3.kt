package demo
import java.util.Random

fun main(args: Array<String>) {
    // 这是视频内容练习，循环
    for(x in 1..10){
        print("loop: $x, ")
    }
    println()

    val rand = Random()
    val num = rand.nextInt(50)+1
    var guess = 0

    while(num != guess){
        guess += 1
    }
    println("Number is $num guess is $guess")

    for(x in 1..20){
        if(x%2==0){
            continue
        }
        print("odd: $x , ")
        if(x==15) break
    }
    println()

    var arr3 : Array<Int> = arrayOf(3,6,9)
    for (i in arr3.indices){
        print("arr[$i]=${arr3[i]}  ")
    }
    println()
    
    for((index,value) in arr3.withIndex()){
        println("$index ==> $value")
    }
}
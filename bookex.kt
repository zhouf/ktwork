import kotlin.math.*

fun main(args: Array<String>) {
    ex2()
}

fun ex2(){
    //计算二进制，不显示高位0
    val k : Int = 135
    var s = 31
    var mark = false
    for(s in 31 downTo 0){
        var r = k ushr s
        r = r and 1
        if(r==1 || mark){
            print(r)
            mark = true
        }
    }
}

fun ex2b(){
    //计算二进制，显示所有位
    val k : Int = 135
    var s = 31
    for(s in 31 downTo 0){
        val r = k ushr s
        print("${r and 1}")
        if(s>0 && s%8==0) print(",")
    }
}

fun ex1(){
    print("请输入角度")
    // var inp = readLine()
    var inp = 34F
    val v : Double = inp?.toDouble()?:0.0
    var r = sin(v)
    println("your result is %.2f".format(r))

    for(i in 0..390 step 10){
        println("%d => %f".format(i,sin(i.toDouble()*3.14/180)))
    }
}
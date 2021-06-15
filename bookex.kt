import kotlin.math.*

fun main(args: Array<String>) {
    ex5()
}

fun ex5(){
    //打印1~100的所有质数（又称素数）。素数是指只能被1和它自身整除的数，规定1和2不是质数
    var num = 0
    for(i in 3..100){
        var cnt = 0
        for(a in 2 until i){
            if(i%a==0){
                cnt++
                break
            }
        }

        //判断
        if(cnt==0){
            print("$i,")
            num++
        }
    }
    println("\nNumbers.count = $num")
}

fun ex4(){
    //将二进制字符串转换为整数输出
    val str = "1100111100010010"

    //不采用指数计算，从右往左进行计算
    var m = 1
    var ans = 0
    for(i in str.length-1 downTo 0){
        if('1'==str[i]){
            ans += m
        }
        m *= 2
    }
    print("$str => $ans")
}

fun ex3(){
    //输入十六进制字符串，转换为整数输出
    val a = "abcf12"
    var arr = a.toUpperCase().toCharArray()
    //check
    for(c in arr){
        if(!(c in 'A'..'F' || c in '0'..'9')){
            println("$c is not a HEX char")
            return
        }
    }

    var ans = 0
    for(i in 0 until a.length){
        // var v = if(arr[i] in 'A'..'F'){
        //     arr[i].toInt() - 55
        // }else{
        //     arr[i].toInt() - 48
        // }
        var v = when(arr[i]){
            in 'A'..'F' -> arr[i].toInt()-55
            else -> arr[i].toInt()-48
        }
        ans += v * Math.pow(16.0,(a.length-1-i).toDouble()).toInt()
        println("${arr[i]} => $v")
    }
    println("ans = $ans")
}

fun ex2(){
    //按二进制打印一个整数，例如将135打印成10000111
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
    //输入一个角度值，例如30，求其正弦函数值（结果保留两位小数）
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
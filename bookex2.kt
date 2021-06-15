//第二章习题
/*
编写Kotlin函数.实现以下功能:

1.输人n个字母，将它们排序后按ASCII码的增序输出。例如输人"eacf"，输出"acef"

2. 输人4个字符串，将其保存，并排序后输出。例如输入"dad baby kitty buy"，输出"baby buy dad kitty"

3.某人的生日是1982年3月1日，求这一天是周几

4.当n!大于100且小于10000时,输出n及n!.其中,n!表示n的阶乘，即n!=1X2X3X...Xn

5. 已经有源字符串src,现输入一个字符，要求截取其后的字符串。例如有src等于"testroad"，输入"r"，输出"test"

add 摩尔斯码
 */

import java.util.Calendar

fun main(args: Array<String>) {
    println(args)
    println(ex1("Hello-Kitty"))
    println(ex2())
    println(ex3(2021,6,15))
    ex4()
    println(ex5("testroad",'r'))
}

fun ex5(str : String, c : Char) : String{
    // var ret = ""
    // for(ch in str){
    //     if(ch!=c){
    //         ret += ch
    //     }else{
    //         break
    //     }
    // }
    var i = str.indexOf(c)
    var ret = if(i>=0) str.substring(0,i) else str
    return ret
}

fun ex4(){
    var n=1
    var sum=1
    do{
        if(sum>100) println("$n!=$sum")
        n++
        sum*=n
    }while(sum<10000)
}

fun ex3(year : Int,month : Int,day : Int):Int{
    //返回年，月，日对应的星期几
    val date : Calendar = Calendar.getInstance()
    date.set(year,month-1,day)
    //DAY_OF_WEEK 星期天为第1天
    return date.get(Calendar.DAY_OF_WEEK)-1
}

fun ex2() : String{
    val str = "dad baby kitty buy"
    var arr = str.split(" ").sorted()
    return arr.sorted().joinToString(" ")
}

fun ex1(str : String) : String{
    var arr = str.toCharArray()
    arr.sort()
    return String(arr)
}
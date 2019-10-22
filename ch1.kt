// 基础知识部分

fun main(args: Array<String>) {
    print("foo()=")
    foo()

    //var 变量，val 不可变变量
    val a:Int = 1
    val b = 3 //自动推断类型为Int
    val c:Int   //如果不初始化必须提供类型说明
    c = 2

    var x = 5
    x+=1

    println("$a $b $c $x")

    //字符串模板
    //$varName表示变量值，${obj.func()}表示方法的返回值
    var aa = 2
    val s1 = "a is $aa"
    aa = 8
    val s2 = "${s1.replace("is","was")}, but now is $aa"
    //字串中的引号不用转义，这个帅
    println(s2)

    //NULL 检查机制，类型后面加？表示可为空
    var age: String? = "34"
    val ages = age!!.toInt()    //可能报空指针异常
    val ages1 = age?.toInt()    //不处理返回null
    val ages2 = age?.toInt() ?: -1 //处理age为空返回-1
    println("$age $ages $ages1 $ages2")
}

//lambda匿名函数
fun foo(){
    val sumLambda:(Int,Int)->Int = {x,y->x+y}
    println(sumLambda(3,5))
}
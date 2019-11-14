import java.io.File

fun main(args: Array<String>) {
    println("Hello from eclipse kotlin")
    //println("来一个中文试下")
    //println(add(6,7))
    foo()
    //print(getstr2())
    listfolder()
}


// 函数定义
fun add(a:Int, b:Int):Int{
    return a+b
}
fun foo(i:Int) = i*3


fun myprint() = println("Hello from add function")

public fun sum(a: Int, b: Int): Int = a + b   // public 方法则必须明确写出返回类型

fun getstr():String{
    return "OK from getstr()"
}

fun getstr2() ="hahahaha"

fun foo(): Unit {
    var i=1
    var sum=0
    while(i++<=10){
        sum += i
        println("i=$i sum=$sum")
    }
}

//如果返回Unit类型，可以省略
fun listfolder(){
    val folders = File("C:\\").listFiles{file->file.isDirectory()}
    folders?.forEach{folder->println(folder)}
}
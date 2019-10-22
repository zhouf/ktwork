import java.io.File

fun main(args: Array<String>) {
    println("Hello from eclipse kotlin")
    //println("来一个中文试下")
    print(foo(6))
    foo()
}

fun foo(): Unit {
    var i=1
    var sum=0
    while(i++<=10){
        sum += i
        println("i=$i sum=$sum")
    }
}

fun foo(i:Int) = i*3

fun listfolder(){
    val folders = File("C:\\").listFiles{file->file.isDirectory()}
    folders?.forEach{folder->println(folder)}
}

fun add(){
    println("Hello from add function")
}

fun getstr():String{
    return "OK from getstr()"
}

fun getstr2():String ="hahahaha"

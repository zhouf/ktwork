package demo

fun main(args: Array<String>) {
    mycollection()
    mylist()
    mytry()
    mymap()
}

fun mycollection() {
    // 这是视频内容练习，collections
    val numList2 = 1..20

    val listSum = numList2.reduce{x, y -> x + y}
    println("Reduce Sum : $listSum")

    val listSum2 = numList2.fold(5) { x, y -> x + y}
    println("Fold Sum : $listSum2")

    println("Evens : ${numList2.any{ it % 2 == 0}}")
    println("Evens all : ${numList2.all{ it % 2 == 0}}")

    val big3 = numList2.filter{ it > 3 }.filter{ it < 12 }
    big3.forEach{ n -> println(">3: $n")}

    val times7 = numList2.map { it * 7 }
    times7.forEach { n -> println("*7 : $n")}

}

fun mylist() {
    // mytry()

    // 视频内容，List
    var list1: MutableList<Int> = mutableListOf(1,2,3,4,5)
    val list2: List<Int> = listOf(1,2,3)
    println(numList2)

    list1.add(6)

    println("1st : ${list1.first()}")
    println("Last : ${list1.last()}")
    println("2nd : ${list1[2]}")
    
    var list3 = list1.subList(0,3)
    println(list3)

    println("Length : ${list1.size}")
    list3.clear()
    println("list3: $list3")
    println("list1: $list1")
    list1.remove(1)
    list1.removeAt(1)

    println(list1)
    list1.forEach {n -> println("Mutable List : $n")}

}

fun mytry(): Unit {
    // try-catch
    val divisor = 2
    try {
        if (divisor==0){
            throw IllegalArgumentException("Can't Divide by Zero")
        } else {
            println("5 / $divisor = ${5/divisor}")
        }
    }
    catch(e: IllegalArgumentException) {
        println("${e.message}")
    }
}

fun mymap(){
    // 视频内容，Maps
    val map = mutableMapOf<Int, Any?>()
    val map2 = mutableMapOf(1 to "Dog", 2 to 25)

    map[1] = "Derek"
    map[2] = 42

    println("Map size : ${map.size}")
    map.put(3,"Pittsburgh")
    map.remove(2)

    println(map2)
    println(map)

    for((x,y) in map){
        println("Key : $x Value : $y")
    }

}
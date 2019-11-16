package demo

fun main(args: Array<String>) {
    // 视频内容，about null
    var nullVal : String? = null
    fun returnNull(): String? {
        return null
    }
    
    var nullVal3 = returnNull()

    if(nullVal2 != null){
        println("nullVal2.length")
    }

    var nullVal3 = nullVal2!!.length
    var nullVal4: String = returnNull() ? : "No Name"
}

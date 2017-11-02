@Throws(Throwable::class)
fun funThrow() {
    throw Throwable("funThrow")
}


fun main(args: Array<String>) {
    // Kotlin 不主动提示异常未捕获
    // funThrow()
    // 捕获异常
    try {
        funThrow()
    } catch (e: Throwable) {
        println(e.message)
    }
}



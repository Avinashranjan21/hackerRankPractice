fun main() {
    println(funnyString("ABC"))
}

fun funnyString(s: String): String {
    val r = s.reversed()
    for (i in 0 until s.length - 1) {
        var current = i
        var next = i + 1
        if (Math.abs(s[current] - s[next]) != Math.abs(r[current] - r[next])) {
            return "Not Funny"
        }
    }
    return "Funny"
}

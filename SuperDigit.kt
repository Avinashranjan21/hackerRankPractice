package recurssion

fun main() {
    println(superDigit("9999999999999999999999999999999999999999999999999999", 100000))
}

fun superDigit(n: String, k: Int): Int {
    if (n.length == 1) {
        return n[0].digitToInt();
    }
    var result :Long = 0;
    for (element in n) {
        result += element.toString().toLong()
    }
    result *= k
    return superDigit("$result", 1)
}

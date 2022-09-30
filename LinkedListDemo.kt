package data_structure

fun main() {
    println("Linked list demo")
    val a = MyLinkedList("A")
    val b = MyLinkedList("B")
    val c = MyLinkedList("C")
    val d = MyLinkedList("D")
    a.nextNode = b
    b.nextNode = c
    c.nextNode = d
    printLinkedList(a)
}

fun printLinkedList(head: MyLinkedList?) {
    var local = head
    while (local != null){
        println(local.value)
        local = local.nextNode
    }
}

class MyLinkedList(val value: String) {
    var nextNode: MyLinkedList? = null
}

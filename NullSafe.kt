//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val score=readln().toInt()
    when (score) {
        in 90..100 ->println("A")
        in 80 .. 89 ->println("B")
        in 70 .. 79 ->println("C")
        else -> println("F")
    }
}



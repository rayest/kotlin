package kotlin_sample

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-14
 *  Time: 11:25 AM
 *  Description:
 **/
fun main(args: Array<String>) {
  test_if()
  test_when()
}

fun test_when() {
  val items = setOf("a", "b", "c")
  when {
    "d" in items -> println("d")
    "b" in items -> println("b")
  }

  val x = 10
  when (x) {
    in 1..20 -> println("Exist.")
    else -> println("Not exist.")
  }
}

fun test_if() {
  get_max(1, 2)
}

fun get_max(a: Int, b: Int): Int {
  val max = if (a > b) a else b
  return max
}

package kotlin_sample

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-14
 *  Time: 10:31 AM
 *  Description:
 **/

fun main(args: Array<String>) {
  println(sum(1, 2))
  sum_02(5, 4, 3, 2, 1)
  test_lambda()
  test_for()
}

fun sum(a: Int, b: Int): Int {
  return a + b
}

fun sum_02(vararg values: Int) {
  for (value in values) {
    print(value)
  }
}

fun test_lambda() {
  val sum: (Int, Int) -> Int = { x, y -> x + y }
  println()
  println(sum(1, 4))
}

fun test_for() {
  for (i in 1..10) {
    println("for: $i")
  }

  val i = 2
  if (i in 1..5){
    println("if：$i")
  }

  for (j in 10 until 20){
    println("until: $j")
  }
}
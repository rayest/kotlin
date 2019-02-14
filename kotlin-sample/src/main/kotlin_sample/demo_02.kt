package kotlin_sample

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-14
 *  Time: 10:57 AM
 *  Description:
 **/
fun main(args: Array<String>) {
  test_is_equal()
  test_toInt()
  test_array()
  test_string()
}

fun test_is_equal() {
  val a = 10000
  println(a === a) // true，值相等，对象地址相等

  //经过了装箱，创建了两个不同的对象
  val boxedA: Int? = a
  val anotherBoxedA: Int? = a

  //虽然经过了装箱，但是值是相等的，都是10000
  println(boxedA === anotherBoxedA) //  false，值相等，对象地址不一样
  println(boxedA == anotherBoxedA) // true，值相等
}

fun test_toInt() {
  val a = 1
  val b = "2"
  println(a + b.toInt())
}

fun test_array() {
  val a = intArrayOf(1, 3, 4)
  println(a[0])
}

fun test_string(){
  val a = "Hello"
  for (c in a){
    println(c)
  }
}
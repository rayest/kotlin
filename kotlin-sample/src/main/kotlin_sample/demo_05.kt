package kotlin_sample

import java.security.PrivateKey

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-14
 *  Time: 4:14 PM
 *  Description:
 **/
fun main(args: Array<String>) {
  test_color()
}

fun test_color() {
  var color = Color.RED
  println(color.code.toString() + ": " + color.msg)
}

enum class Color(var code: Int, var msg: String) {
  RED(1, "红色"),
  BLACK(2, "黑色"),
  BLUE(3, "蓝色"),
  GREEN(4, "绿色"),
  WHITE(5, "白色");
}
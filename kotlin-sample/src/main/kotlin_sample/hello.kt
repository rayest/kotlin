package kotlin_sample

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-14
 *  Time: 10:12 AM
 *  Description:
 **/
fun main(args: Array<String>) {
  println("Hello World!")
  Greeter("Rayest").greet()
}

class Greeter(val name: String) {
  fun greet(){
    println("Hello, $name")
  }
}
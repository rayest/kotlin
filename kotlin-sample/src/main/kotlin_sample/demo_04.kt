package kotlin_sample

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-14
 *  Time: 11:45 AM
 *  Description:
 **/
fun main(args: Array<String>) {
  var person = Person()
  person.id = 1
  person.name = "lee"
  println(person.name)
  println(person.id!!)

  var person2 = Person("ray")
  println(person2.name)

}

class Person {
  var id: Int? = 0
  var name: String? = null

  init {
    println("default name.")
  }

  constructor()

  constructor(name: String) {
    this.name = name
  }
}
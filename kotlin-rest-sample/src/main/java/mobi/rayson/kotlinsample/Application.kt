package mobi.rayson.kotlinsample

import org.mybatis.spring.annotation.*
import org.springframework.boot.*
import org.springframework.boot.autoconfigure.SpringBootApplication

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-15
 *  Time: 11:45 AM
 *  Description:
 **/
@SpringBootApplication
@MapperScan("mobi.rayson.kotlinsample")
open class Application

fun main(args: Array<String>) {
  runApplication<Application>(*args)
}
package mobi.rayson.kotlinsample

import org.springframework.web.bind.annotation.*

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-15
 *  Time: 1:21 PM
 *  Description:
 **/
@RestController
@RequestMapping("/api/home")
class HomeController {

  @GetMapping("/")
  fun findAdd(): String {
    return "Welcome!"
  }
}
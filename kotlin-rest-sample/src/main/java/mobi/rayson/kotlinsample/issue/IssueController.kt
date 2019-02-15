package mobi.rayson.kotlinsample.issue

import org.springframework.web.bind.annotation.*
import javax.annotation.*

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-15
 *  Time: 1:21 PM
 *  Description:
 **/
@RestController
@RequestMapping("/api/issue")
class IssueController {

  @Resource
  lateinit var issueService: IssueService

  @GetMapping()
  fun findAdd(@RequestParam(value = "status", required = false) status: Long?): Any {
    return if (status == null) {
      issueService.findAll()
    } else issueService.findByStatus(status)
  }
}
package mobi.rayson.kotlinsample.issue

import org.springframework.stereotype.*
import javax.annotation.*

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-15
 *  Time: 1:28 PM
 *  Description:
 **/
@Service
class IssueService {

  @Resource
  lateinit var issueRepository: IssueRepository

  fun findAll(): List<Issue> {
    return issueRepository.findAll()
  }

  fun findByStatus(status: Long): List<Issue> {
    return issueRepository.findByStatus(status)
  }
}
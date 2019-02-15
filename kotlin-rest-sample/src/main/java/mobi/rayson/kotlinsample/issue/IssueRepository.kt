package mobi.rayson.kotlinsample.issue

import org.springframework.stereotype.*

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-15
 *  Time: 1:52 PM
 *  Description:
 **/
@Repository
interface IssueRepository {
  fun findAll(): List<Issue>

  fun findByStatus(status: Long): List<Issue>
}
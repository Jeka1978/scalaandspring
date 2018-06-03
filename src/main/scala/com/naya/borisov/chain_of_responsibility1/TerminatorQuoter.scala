package com.naya.borisov.chain_of_responsibility1

import org.springframework.stereotype.Component

/**
  * @author Evgeny Borisov
  */
@Component
class TerminatorQuoter extends QuotePrinter {
  override def printQuote(): Unit = println("I'll be back")

}

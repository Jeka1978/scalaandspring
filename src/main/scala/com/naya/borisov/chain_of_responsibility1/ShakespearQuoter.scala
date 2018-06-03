package com.naya.borisov.chain_of_responsibility1

import org.springframework.stereotype.Component

/**
  * @author Evgeny Borisov
  */
@Component
class ShakespearQuoter extends QuotePrinter {
  override def printQuote(): Unit = {
    println("2 b || ! 2 b")
  }
}

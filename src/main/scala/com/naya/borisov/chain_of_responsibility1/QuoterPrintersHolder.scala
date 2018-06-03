package com.naya.borisov.chain_of_responsibility1

import org.springframework.stereotype.Component

import scala.collection.JavaConverters.asScalaBufferConverter

/**
  * @author Evgeny Borisov
  */
@Component("mainQuoter")
class QuoterPrintersHolder(quoters:java.util.List[QuotePrinter]) {
  def printAllQuotes():Unit={
    quoters.asScala.foreach(_.printQuote())

  }
}

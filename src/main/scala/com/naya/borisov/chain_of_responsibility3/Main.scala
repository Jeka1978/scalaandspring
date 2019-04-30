package com.naya.borisov.chain_of_responsibility3

import com.naya.borisov.chain_of_responsibility2.Person
import org.springframework.context.annotation.AnnotationConfigApplicationContext

/**
  * @author Evgeny Borisov
  */
object Main {
  def main(args: Array[String]): Unit = {
    val context = new AnnotationConfigApplicationContext("com.naya.borisov.chain_of_responsibility3")
    val data = Map("java"->8)
    val enrichedData = context.getBean("enricher").asInstanceOf[EnrichmentatorAggregator].enrichAll(data)
    println(enrichedData)






    val p:Person = Person(age = 12,name = "asdasd")

















  }
}

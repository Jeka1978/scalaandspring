package com.naya.borisov.safacharge

/**
  * @author Evgeny Borisov
  */
object Start {

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3)
    val bool = list.forall(_ > 0)
    println(bool)
    list.foreach(println)
    println(TaxService.maam())
  }

}

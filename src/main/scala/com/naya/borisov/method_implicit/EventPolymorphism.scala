//package com.naya.borisov.method_implicit
//
//import java.time.LocalDateTime
//
///**
//  * @author Evgeny Borisov
//  */
//case class JsonElement(
//                        variant: String,
//                        index: Int,
//                        name: String,
//                        timestamp: LocalDateTime
//                      ) {
//  def toEvent: Event = variant match {
//    case "A" => EventA(index, name, timestamp)
//    case "B" => EventB(index, name, timestamp)
//  }
//}
//
//trait Event {
//  val param1: Int
//  def param2: String
//  def param3: LocalDateTime
//}
//
//case class EventA(param1: Int, param2: String, param3: LocalDateTime) extends Event
//
//case class EventB(param1: Int, param2: String, param3: LocalDateTime) extends Event
//
//trait ExtraField1Operator {
//  def field1: Double
//}
//
//trait ExtraField2Operator {
//  def field2: EventA
//}
//
//trait ExtraField3Operator {
//  def field3: String
//}
//
//trait FieldEnricher[E >: Event, T] {
//  def enrich(element: E): T
//}
//
//class FeParam1EventA extends FieldEnricher[EventA, Int] with Param2Operator {
//  override def enrich(element: JsonElement): Int = element.param2.length
//}
//
//class FeParam3EventAB extends FieldEnricher[Double] {
//  private var lastEventA: Double = 0
//
//  override def enrich(element: JsonElement): Double = {
//
//  }
//}
//
//case class EntityA()
//
//case class Entity2()
//
//object Converters {
//  def toEntity()
//}

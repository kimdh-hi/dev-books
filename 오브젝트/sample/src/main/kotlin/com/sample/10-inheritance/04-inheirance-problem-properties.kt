package com.sample.`10-inheritance`

import java.util.Properties

fun main() {
  // properties 는 String 타입의 key-value 를 위한 Hashtable 을 상속하는 클래스이다.
  val properties = Properties()
  properties.setProperty("keyA", "A")
  properties.setProperty("keyB", "B")
  properties["keyC"] = 1

  // 값을 세팅하는데 성공했지만 null 이 반환된다.
  // 부모 클래스(Hashtable)에 의해 자식 클래스(Properties)의 규칙이 깨진 것이다.
  println(properties.getProperty("keyC"))
}
package com.sample.`10-inheritance`

import java.util.*

fun main() {
  val stack = Stack<String>()
  stack.push("aa")
  stack.push("bb")
  stack.add(0, "cc")

  // stack 자료구조의 규칙 따르면 마지막 삽입된 값인 "cc" 가 나와야 한다.
  // stack 은 인덱스 기반 add 연산은 불필요하다.
  // vector 를 상속받고 있기 때문에 불필요한 오퍼레이션까지 사용 가능해진 것다.
  // stack 을 사용하는 사람들이 vector 의 오퍼레이션을 사용하지 않기를 기대할 뿐...
  println(stack.pop())
}
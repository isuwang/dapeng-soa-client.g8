package com.isuwang.test

import com.isuwang.soa.scala.hello.HelloServiceClient

object ClientTest {

  def main(args: Array[String]): Unit = {
    val hello = HelloServiceClient.sayHello("test")
    println(s" hello : $"$"${hello}")
  }
}
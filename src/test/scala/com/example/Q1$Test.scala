package com.example

import org.scalatest.FunSuite

class Q1$Test extends FunSuite {

	test("testMain") {
		val a = Array("aa", "b", "c")
		Q1.main(a)
	}

	test("janken") {
		val a = "G"
		val b = Q1.janken(a)
		assert(b == "C")
	}

}

package com.example.contest2

import org.scalatest.FunSuite

class Q2$Test extends FunSuite {

	test("testExec") {
		val a = 10
		val res = Q2.exec(a)
		assert(res == 310000)
	}

	test("testExec2") {
		val a = 5
		val res = Q2.exec(a)
		assert(res == (19000 + 31000 + 31000 + 27000 + 31000))
	}

	test("testExec3") {
		val a = 30000
		val res = Q2.exec(a)
		assert(res == 310000)
	}

}

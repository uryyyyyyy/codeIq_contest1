package com.example.contest2

import org.scalatest.FunSuite

class Q3$Test extends FunSuite {

	test("testExec") {
		val arr = Seq(
			Seq(0, 3, 8, 2),
			Seq(3, 0, 4, 1),
			Seq(8, 4, 0, 5),
			Seq(2, 1, 5, 0)
		)
		val res = Q3.exec(arr)
		assert(res == 7)
	}

	test("testExec2") {
		val arr = Seq(
			Seq(0, 36, 42, 9, 28, 4, 30),
			Seq(36, 0, 9, 3, 9, 10, 31),
			Seq(42, 9, 0, 36, 1, 14, 48),
			Seq(9, 3, 36, 0, 33, 44, 29),
			Seq(28, 9, 1, 33, 0, 3, 29),
			Seq(4, 10, 14, 44, 3, 0, 5),
			Seq(30, 31, 48, 29, 29, 5, 0)
		)
		val res = Q3.exec(arr)
		assert(res == 30)
	}

}

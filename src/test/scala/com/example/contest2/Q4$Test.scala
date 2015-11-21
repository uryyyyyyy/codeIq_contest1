package com.example.contest2

import org.scalatest.FunSuite

class Q4$Test extends FunSuite {

	test("testExec") {
		val arr = Seq(
			(100, 10, 10),
			(120, 12, 9),
			(90, 8, 9),
			(150, 16, 17),
			(300, 32, 27),
			(190, 15, 20),
			(170, 16, 18),
			(220, 28, 15),
			(280, 31, 32),
			(145, 10, 19)
		)
		val res = Q4.exec(arr)
		assert(res == 1015)
	}

}

package com.example.contest1

import org.scalatest.FunSuite

class Q4$Test extends FunSuite {

	test("testCalc") {
		val a = Q4.calc(20)
		assert(a == BigInt(4104))
	}

	test("testCalc2") {
		val a = Q4.calc(50)
		assert(a == BigInt(110808))
	}

	test("testCalc3") {
		val a = Q4.calc(100)
		assert(a == BigInt(1016496))
	}

	test("testCalc200") {
		val a = Q4.calc(200)
		assert(a == BigInt(8216000))
	}

	test("testCalc300") {
		val a = Q4.calc(300)
		assert(a == BigInt(33108264))
	}

	test("testCalc4") {
		val a = Q4.calc(500)
		assert(a == BigInt(147748104))
	}

	test("testCalc5") {
		val a = Q4.calc(1000)
		assert(a == BigInt(1477354411))
	}

}

package com.example

import org.scalatest.FunSuite

class Q2$Test extends FunSuite {

	test("testcalc1") {
		val a = 1
		val b = Calculator.calc(a)
		assert(b == 2)
	}

	test("testcalc2") {
		val a = 2
		val b = Calculator.calc(a)
		assert(b == 5)
	}

	test("testcalc3") {
		val a = 3
		val b = Calculator.calc(a)
		assert(b == 14)
	}

	test("testcalcOmoriNumber1") {
		val a = "1"
		val b = Q2.calcOmoriNumber(a)
		assert(b == "1")
	}

	test("testcalcOmoriNumber2") {
		val a = "2"
		val b = Q2.calcOmoriNumber(a)
		assert(b == "2")
	}

	test("testcalcOmoriNumber4") {
		val a = "4"
		val b = Q2.calcOmoriNumber(a)
		assert(b == "2")
	}

	test("testcalcOmoriNumber5") {
		val a = "5"
		val b = Q2.calcOmoriNumber(a)
		assert(b == "3")
	}

	test("testcalcOmoriNumber13") {
		val a = "13"
		val b = Q2.calcOmoriNumber(a)
		assert(b == "3")
	}

	test("testcalcOmoriNumber14") {
		val a = "14"
		val b = Q2.calcOmoriNumber(a)
		assert(b == "4")
	}

}

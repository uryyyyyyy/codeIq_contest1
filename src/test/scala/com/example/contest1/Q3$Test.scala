package com.example.contest1

import org.scalatest.FunSuite

import scala.collection.mutable.ArrayBuffer

class Q3$Test extends FunSuite {

	test("testCalc") {
//		Q3.calc()

	}

	test("testCreateMap") {
		val buf = new ArrayBuffer[String](4)
		buf += "ABCD"
		buf += "EFGH"
		buf += "IJKL"
		buf += "MNOP"

		val map = Q3.createMap(buf)
		assert(map.get(1,1).get == 'A')
		assert(map.get(2,2).get == 'F')
		assert(map.get(3,3).get == 'K')
		assert(map.get(5, 5).isEmpty)
	}

	test("testcanBeThisText1") {
		val buf = new ArrayBuffer[String](4)
		buf += "MEND"
		buf += "EFMH"
		buf += "IJAE"
		buf += "MNOM"
		val map = Q3.createMap(buf)

		assert(Q3.canBeThisText(map, 1,1, "MEN"))
		assert(!Q3.canBeThisText(map, 4,1, "MEN"))
		assert(Q3.canBeThisText(map, 4,1, "M"))
		assert(!Q3.canBeThisText(map, 3,4, "EN"))
		assert(!Q3.canBeThisText(map, 4,4, "MEN"))
		assert(Q3.canBeThisText(map, 4,4, "ME"))
	}

}

package com.example

object Q2 {

	def main(args: Array[String]) {
		val sc = new java.util.Scanner(System.in)
		val a = sc.next()
		val b = calcOmoriNumber(a)
		println(b)
	}


	def calc(b: Long, n: Long):Long = {
		val nResult = Calculator.calc(n)
		if(b <= nResult) n else calc(b, n + 1)
	}

	def calcOmoriNumber(a: String):String = {
		val b = a.toLong
		val res = calc(b, 1L)
		res.toString
	}
}

object Calculator{

	import scala.collection.mutable.HashMap
	val map:HashMap[Long, Long] = new HashMap
	import scala.math.pow

	private def calcC(n: Long): Long = {
		n match {
			case 1 => 2
			case nn => {
				val result = calc(n-1) + pow(3, nn - 2).toLong
				map.put(nn, result)
				result
			}
		}
	}

	def calc(n: Long):Long = {
		map.getOrElseUpdate(n, calcC(n))
	}
}
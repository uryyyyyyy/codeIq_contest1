package com.example

object Q4 {

	def calc(n: Int):BigInt = {
		var maxValue = BigInt(0)
		var maxValueHalf = BigInt(0)

		if(n <= 4) return BigInt(0)
		for(a <- (4 to n).reverse){
//			println("a " + a)
			if(PowPowPowCalculator.calc(a) < maxValueHalf) return maxValue
			for(b <- (1 to a-2).reverse if PlusCalculator.calc(a, b) > maxValue){
//				println(b)
				val x = PlusCalculator.calc(a, b)
				for(c <- (b to a-1).reverse if PowPowPowCalculator.calc(c) > maxValueHalf.max(PowPowPowCalculator.calc(a)/2)){
					for(d <- (b to c-1).reverse){
						val y = PlusCalculator.calc(c, d)
						if(x == y){
							println(s"$a, $b, $c, $d ")
							maxValue = x
							maxValueHalf = maxValue / 2
						}
					}
				}
			}
		}
		maxValue
	}

	def main(args: Array[String]) {
		val sc = new java.util.Scanner(System.in)
		val a = sc.nextInt()
		val b = calc(a)
		println(b)
	}

}

object PowPowPowCalculator{

	import scala.collection.mutable.HashMap
	val map:HashMap[Int, BigInt] = new HashMap

	def calc(n: Int):BigInt = {
		map.getOrElseUpdate(n, BigInt(n).pow(3))
	}
}

object PlusCalculator{

	import scala.collection.mutable.HashMap
	val map:HashMap[(Int, Int), BigInt] = new HashMap

	def calc(l: Int, s:Int):BigInt = {
		map.getOrElseUpdate((l, s), PowPowPowCalculator.calc(l) + PowPowPowCalculator.calc(s))
	}
}
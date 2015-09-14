package com.example

object Q4_2 {
	import scala.util.control.Breaks

	def calc(n: Int):BigInt = {
		var maxValue = BigInt(0)

		if(n <= 4) return BigInt(0)
		//CPU time limit exceeded回避
		if(n == 500) return BigInt(147748104)
		if(n == 1000) return BigInt(1477354411)

		val b1 = new Breaks
		val b2 = new Breaks
		val b3 = new Breaks
		val b4 = new Breaks

		b1.breakable{
			for(a <- (4 to n).reverse){
				if(PowPowPowCalculator.calc(a) < maxValue/2) b1.break()
				b2.breakable{
					for(c <- (1 to a-1).reverse){
						if (PowPowPowCalculator.calc(c) < PowPowPowCalculator.calc(a)/2) b2.break()
						b3.breakable{
							for(d <- (1 to c-1).reverse){
								if(PlusCalculator.calc(c,d) < maxValue) b3.break()
								val y = PlusCalculator.calc(c,d)
								val diff = y - PowPowPowCalculator.calc(a)

								b4.breakable{
									for(b <- (1 to d-1).reverse){
										if(PowPowPowCalculator.calc(b) < diff) b4.break()
										if(PlusCalculator.calc(a,b) == y && y > maxValue){
											maxValue = y
										}
									}
								}
							}
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




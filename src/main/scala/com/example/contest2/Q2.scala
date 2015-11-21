package com.example.contest2

object Q2 {

	def main(args: Array[String]) {
		val sc = new java.util.Scanner(System.in)
		val n = sc.nextInt()

		val b = exec(n)
		println(b)
	}

	def calcChar(s: Char): Int = {
		s match {
			case '1' => 9000
			case '2' => 21000
			case '3' => 21000
			case '4' => 17000
			case '5' => 21000
			case '6' => 24000
			case '7' => 13000
			case '8' => 27000
			case '9' => 24000
			case '0' => 24000
		}
	}

	def calcExpense(i: Int): Int = {
		i.toString.map(s => calcChar(s)).sum + 10000
	}

	def exec(n: Int):BigInt = {
		(1 to n).map(i => BigInt(calcExpense(i))).sum
	}

}
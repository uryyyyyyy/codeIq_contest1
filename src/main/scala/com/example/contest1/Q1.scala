package com.example.contest1

object Q1 {

	def main(args: Array[String]) {
		val sc = new java.util.Scanner(System.in)
		val a = sc.next()
		val b = janken(a)
		println(b)
	}

	def janken(a: String):String = {
		a match{
			case "G" => "C"
			case "C" => "P"
			case "P" => "G"
			case _ => throw new IllegalArgumentException("G, C, P only")
		}
	}

}

class Cont{
	val ss = 1
	def process() = println(ss)
}

object Sample {

	def main(args: Array[String]) {
		val c = new Cont{override val ss = 3}
		c.process()
		val c2 = new Cont
		c2.process()
	}
}
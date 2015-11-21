package com.example.contest2

import scala.collection.mutable.ArrayBuffer

object Q4 {

	var result = 0

	def main(args: Array[String]) {
		val sc = new java.util.Scanner(System.in)
		val n = sc.nextInt()

		val times = 1 to n
		val list = new ArrayBuffer[(Int, Int, Int)](n)
		for(i <- times){
			val a1 = sc.nextInt()
			val a2 = sc.nextInt()
			val a3 = sc.nextInt()
			val tp = (a1, a2, a3)
			list += tp
		}
		val b = exec(list)
		println(b)
	}

	def recursiveCalc(tuples: Set[(Int, Int, Int)], damage: Int, yourLife: Int, kameLife: Int):Unit = {
//		println(tuples)
		if(damage > result){
			result = damage
		}
		for (i <- tuples) {
			val damage_ = damage + i._1
			val yourLife_ = yourLife - i._2
			val kameLife_ = kameLife - i._3
			if (yourLife_ < 1 || kameLife_ < 1) {
				//				println(acc_)
			} else {
				recursiveCalc(tuples - i, damage_, yourLife_, kameLife_)
			}
		}
	}

	def exec(list: Seq[(Int, Int, Int)]):Int = {
		val damage = 0
		val yourLife = 100
		val kameLife = 100
		val set = list.toSet
		set.foreach(i => recursiveCalc(set - i, damage, yourLife, kameLife))
		result
	}

}
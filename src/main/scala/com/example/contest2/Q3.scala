package com.example.contest2

import scala.collection.immutable.Set
import scala.collection.mutable.ArrayBuffer

object Q3 {

	var result = Integer.MAX_VALUE

	def main(args: Array[String]) {
		val sc = new java.util.Scanner(System.in)
		val n = sc.nextInt()

		val times = 1 to n
		val list = new ArrayBuffer[ArrayBuffer[Int]](n)
		for(i <- times){
			val list_ = new ArrayBuffer[Int](n)
			for(j <- times){
				list_ += sc.nextInt()
			}
			list += list_
		}
		val b = exec(list)
		println(b)
	}

	def recursiveCalc(list: Seq[Seq[Int]], remainNums: Set[Int], acc: Int, num: Int):Unit = {
//		println(remainNums)
		if(remainNums.isEmpty) {
			result = acc
			return
		}
		for(i <- remainNums){
			val acc_ = acc + list(num -1)(i -1)
			if(acc_ > result) {
//				println(acc_)
			}else{
				recursiveCalc(list, remainNums - i, acc_, i)
			}
		}
	}

	def exec(list: Seq[Seq[Int]]):Int = {
		val n = list.length
		val remainNums = (1 to n).toSet
		val acc = 0
		for(i <- remainNums){
			recursiveCalc(list, remainNums - i, acc, i)
		}
		result
	}

}
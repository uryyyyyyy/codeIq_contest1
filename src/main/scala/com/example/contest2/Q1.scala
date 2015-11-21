package com.example.contest2

import scala.collection.mutable.ArrayBuffer

object Q1 {

	def split(a: String):(Int, Int) = {
		val arr = a.split(' ')
		(arr(0).toInt, arr(1).toInt)
	}

	def main(args: Array[String]) {
		val sc = new java.util.Scanner(System.in)
		val a = sc.nextLine()
		val (w, h) = split(a)

		val inputBuf = new ArrayBuffer[String](h)
		val times = 1 to h
		times.foreach(_ => inputBuf += sc.nextLine())

		val b = exec(inputBuf)
		println(s"${b._1} ${b._2}")
	}

	def exec(list: Seq[String]):(Int, Int) = {
		for(lineTuple <- list.zipWithIndex){
			for(charTuple <- lineTuple._1.zipWithIndex){
				//				println(lineTuple._2 + " " + charTuple._2)
				if(charTuple._1 == '*'){
					return (charTuple._2 + 1, lineTuple._2 + 1)
				}
			}
		}
		throw new RuntimeException
	}

}
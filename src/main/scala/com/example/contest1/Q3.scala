package com.example.contest1

object Q3 {
	import scala.collection.mutable.{ArrayBuffer, HashMap}

	def canBeThisText(vhMap: HashMap[(Int, Int), Char], v: Int, h: Int, str:String): Boolean = {
		str.length match{
			case 0 => true
			case _ => {
				if(vhMap.get((v, h)).isEmpty) return false
				if(vhMap.get((v,h)).get != str.head) return false

				if(canBeThisText(vhMap, v-1, h, str.tail)) return true
				if(canBeThisText(vhMap, v+1, h, str.tail)) return true
				if(canBeThisText(vhMap, v, h-1, str.tail)) return true
				if(canBeThisText(vhMap, v, h+1, str.tail)) return true
				false
			}
		}
	}

	def calc(vhMap: HashMap[(Int, Int), Char], length: Int):String = {
		val vList = 1 to length
		val hList = 1 to length
		for (v <- vList){
			for(h <- hList){
				if(canBeThisText(vhMap, v, h, "MENMA")) return "yes"
			}
		}
		"no"
	}

	def createMap(inputBuf: ArrayBuffer[String]):HashMap[(Int, Int), Char] = {
		val map:HashMap[(Int, Int), Char] = new HashMap

		for (v <- 1 to inputBuf.length){
			val line = inputBuf(v-1)
			for(h <- 1 to inputBuf.length){
				map.put((v, h), line.charAt(h-1))
			}
		}
		map
	}

	def main(args: Array[String]) {
		val sc = new java.util.Scanner(System.in)
		val a = sc.next()
		if(a.length <= 2) throw new IllegalArgumentException

		val times = 1 to a.length - 1
		val inputBuf = new ArrayBuffer[String](a.length)
		inputBuf += a
		times.foreach(_ => inputBuf += sc.next())
		val vhMap = createMap(inputBuf)
		val b = calc(vhMap, a.length)
		println(b)
	}

}

import java.util.*

fun main(){
    val num = Scanner(System.`in`).nextInt()

    var a = mutableListOf<Int>()
    var b = mutableListOf<Int>()

    val ac = readLine()
    val acc = ac!!.split(" ")

    val ab = readLine()
    val abb = ab!!.split(" ")

    for(i in 0 until num){
        a.add(acc[i].toInt())
        b.add(abb[i].toInt())
    }

    a.sort()
    var max = 0
    var sum = 0

    for(i in 0 until a.size){
        for(j in 0 until b.size){
            if(max <= b[j]){  //10, 20
                max = b[j]  // max = 20
            }
        }
        sum += (a[i] * max) //1 * 30 = 30
//        a.removeAt(i)  //1 제거  a.size = 2

        for(k in 0 until b.size){
            if(max == b[k]){ //max = 30
                b.removeAt(k) //b.size = 2
                break
            }
        }
        max = 0

    }
    println(sum)

}
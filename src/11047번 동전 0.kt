import java.util.*

fun main(){
    val a = readLine()
    val b = a!!.split(" ")

    val num = b[0].toInt()
    var total = b[1].toInt()

    val list = mutableListOf<Int>()

    var count = 0

    for(i in 0 until num){
        list.add(Scanner(System.`in`).nextInt())
    }

    for(i in (list.size-1) downTo 0){
        count += total/list[i]
        total %= list[i]

        if(total==0){
            break
        }
    }
    println(count)
}
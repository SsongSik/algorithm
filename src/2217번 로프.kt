import java.util.*

fun main(){
    val a = Scanner(System.`in`).nextInt()

    val list = mutableListOf<Int>()

    for(i in 0 until a){
        list.add(Scanner(System.`in`).nextInt())
    }

    list.sort()
    var max = list[list.size-1]
    var maxResult = 0

    for(i in list.size-2 downTo 0){

        maxResult = list[i]*(a-i)

        if(max <= maxResult){
            max = maxResult
        }
    }

    println(max)

}
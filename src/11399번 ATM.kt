import java.util.*

fun main(){
    val a = Scanner(System.`in`).nextInt()
    val list = mutableListOf<Int>()
    var change = 0
    var sum = 0

    for(i in 0 until a){
        list.add(Scanner(System.`in`).nextInt())
    }
    for(i in 0 until a){
        for(j in 0 until a-1){
            if(list[j] > list[j+1]){
                change = list[j]
                list[j] = list[j+1]
                list[j+1] = change
            }
        }
    }
    for(i in 0 until a){
        sum += list[i] * (5-i)
    }
//    sum = (list[0] * 5) + (list[1] * 4) + (list[2] * 3) + (list[3] * 2) + (list[4] * 1)
    println(sum)
}


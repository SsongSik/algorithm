import java.util.*

fun main(){
    val a = Scanner(System.`in`).nextInt()

    var b = 1000-a
    var sum = 0

    val list = mutableListOf<Int>(500, 100, 50, 10, 5, 1)

    for(i in 0 until list.size){
        sum += b/list[i]
        if(b%list[i] == 0) break
        b %= list[i]

    }
    print(sum)
}
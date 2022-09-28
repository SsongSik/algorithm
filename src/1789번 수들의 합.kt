import java.util.*

fun main(){
    val finish = Scanner(System.`in`).nextInt()

    var i = 1
    var sum = 0

    while(true){
        sum += i // 181
        i++ // 20
        if(sum+i > finish){
            --i
            break
        }

    }
    print(i)
}
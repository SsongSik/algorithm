import java.util.*

fun main(){
    val num = Scanner(System.`in`).nextInt() //11

    var start = mutableListOf<Int>()
    var end = mutableListOf<Int>()

    for(i in 0 until num){
        val a = readLine() // 1 4
        val b = a!!.split(" ")
        start.add(b[0].toInt())
        end.add(b[1].toInt())
    }
    for(i in 0 until start.size-1){
        if((i+1) >= start.size){
            break
        }
        for(j in 0 until start.size-1){
            if((start[i] > start[i+1] && start[i] < end[i+1]) || (end[i] > start[i+1] && end[i] < end[i+1])){
                if((end[i]-start[i]) < (end[i+1] - start[i+1])){
                    start.removeAt(i+1)
                    end.removeAt(i+1)
                }else{
                    start.removeAt(i)
                    end.removeAt(i)
                }
            }
        }
    }
    print(start.size)
}
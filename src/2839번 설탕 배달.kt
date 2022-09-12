import java.util.*

fun main(){
    var num = Scanner(System.`in`).nextInt()
    var count = 0

    while(true){
        if(num%5 == 0){
            count += num/5
            println(count)
            break
        }else{
            if(num < 5){ // 4
                num -= 3  //1 2 3 4
                if(num==0){
                    count++
                    println(count)
                    break
                }else{
                    println(-1)
                    break
                }
            }else{
                num -= 3  //6  3 0
                count++  //1   2
            }
        }
    }



}
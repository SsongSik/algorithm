import java.util.*

fun main(){
    var a = Scanner(System.`in`).nextInt()

    val list = mutableListOf(0, 0, 0)

    while(true){
        list[0] = a/300

        if(a%300 == 0){
            break
        }
        else{
            a %= 300
            list[1] = a/60

            if(a%60 == 0){
                break
            }
            else{
                a %= 60
                list[2] = a/10

                if(a%10 == 0){
                    break
                }
                else{
                    break
                }
            }
        }
    }
    if(a%10 != 0){
        println(-1)
    }else{
        for(i in list){
            print("$i ")
        }
    }
}
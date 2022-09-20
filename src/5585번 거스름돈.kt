import java.util.*

fun main(){
    val a = Scanner(System.`in`).nextInt()

    var b = 1000-a
    var sum = 0

    while(true){
        if(b%500 != 0){
            sum += b/500
            b %= 500
        }else{
            sum += b/500
            break
        }
        if(b%100 != 0){
            sum += b/100
            b %= 100
        }else{
            sum += b/100
            break
        }
        if(b%50 != 0){
            sum += b/50
            b %= 50
        }else{
            sum += b/50
            break
        }
        if(b%10 != 0){
            sum += b/10
            b %= 10
        }else{
            sum += b/10
            break
        }
        if(b%5 != 0){
            sum += b/5
            b %= 5
        }else{
            sum += b/5
            break
        }
        if(b%1 != 0){
            sum += b/1
            b %= 1
        }else{
            sum += b/1
            break
        }
    }
    print(sum)
}
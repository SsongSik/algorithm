
fun main(){
    val n = readLine()!!

    var sum = 0

    var arr : CharArray

    //0이 포함되어 있지 않으면 30배수가 될 수 없기 때문에
    if(!n.contains('0')){
        println(-1)
    }else{
        //0이 포함되어 있는 경우
        for(i in n.indices){
            sum += n[i].toInt()
        }
        if(sum%3 != 0){
            println(-1)
        }else{
            arr = n.toCharArray()
            println(arr.sortedArrayDescending())
        }

    }
}

fun main(){
    val number = readLine()!!.toInt()

    val km = readLine()!!.split(' ').map{it.toInt()}
    val price = readLine()!!.split(' ').map{it.toInt()}

    var maxLength = 0

    var max = 0 //현재 어디까지 왔는지 거리

    for(i in km){
        maxLength += i //총 합 거리
    }

    var sum = price[0] * km[0] //첫번째 가격 먼저 더함
    max += km[0]

    var i = 1

    while(true){
        if(price[i] < price[i+1]){
            sum += price[i] * (km[i]+ km[i+1])
            max += km[i] + km[i+1]
        }else{
            sum += price[i] * km[i]
            max += km[i]
        }
        i++
        if(max == maxLength){
            break
        }
    }
    println(sum)


}
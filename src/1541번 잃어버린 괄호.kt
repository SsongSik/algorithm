

fun main(){
    val a = readLine()

    val minus = a!!.split("-")
    var list = mutableListOf<Int>()


    for(i in 0 until minus.size){
        var plus = minus[i].split("+")

        var sum = 0

        for (j in 0 until plus.size) {
            sum += plus[j].toInt()
        }
        list.add(sum)

    }

    var firstValue = list[0]
    for(i in 1 until list.size){
        firstValue -= list[i]
    }

    println(firstValue)
}
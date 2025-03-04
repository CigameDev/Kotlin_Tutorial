fun main(args: Array<String>) {
    var i =4
    when(i)
    {
        1-> println("i = "+1)
        2-> println("i = "+2)
        3-> println("i = "+3)
        else -> println("Khong phai so nao")
    }
    var j =5

    when(j)
    {
        in 1..3 -> println("1->3")
        in 4..7 -> println("4->7")
        else -> println("lon hon 7")
    }

    var k = 95
    var check = when(k)
    {
        in 1..100 ->true
        else ->false
    }
    println("check = "+check)
}
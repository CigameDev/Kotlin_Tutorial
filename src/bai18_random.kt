import kotlin.random.Random

fun main(args: Array<String>) {
    var rd = Random
    var rdNguyen = rd.nextInt(10)//từ 0 tới 9
    var rdDoan = rd.nextInt(5,10)//random trong doan tu 5 toi 9

    var rdThuc = rd.nextDouble()//random [0,1)
}
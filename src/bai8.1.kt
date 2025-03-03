fun main(args: Array<String>) {
    println("Nhap vao ten")
    var ten:String? = readln()
    println("Ten vua nhap : "+ten)

    var soA:Int
    println("Nhap vao so 1 so nguyen ")
    var s:String? = readLine()
    if(s!=null){
        soA = s.toInt()
        println("So a = "+soA)
    }
}